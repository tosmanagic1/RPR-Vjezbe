package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {

    private HashMap <String, TelefonskiBroj> imenik;

    public Imenik() {
        imenik = new HashMap<>();
    }
    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime) {
        if (imenik.isEmpty()) throw new Izuzetak("Prazan imenik!");
        for (String s : imenik.keySet()) {
            if (s.equals(ime)) {
                TelefonskiBroj tb = imenik.get(ime);
                return tb.ispisi();
            }
        }

        return null;
    }

    public String dajIme(TelefonskiBroj broj) {
        if (imenik.isEmpty()) throw new Izuzetak("Prazan imenik!");
            for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
                if (entry.getValue().equals(broj)) {
                    return entry.getKey();
                }
        }

        return null;
    }

      public String naSlovo(char s) {
          int i = 0;

          ArrayList<String> lista = new ArrayList<String>();
          if (imenik.isEmpty()) throw new Izuzetak("Prazan imenik!");
          for (String string : imenik.keySet()) {
              if (string.charAt(0) == s) {
                  i++;
                  lista.add(i + ". " + string + " - " + dajBroj(string));
              }
          }
          return String.join("\n", lista);
    }

    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> setStringova = new TreeSet<String>();
        if (imenik.isEmpty()) throw new Izuzetak("Prazan imenik!");
            for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
                if (entry.getValue() instanceof FiksniBroj) {
                    FiksniBroj fb = (FiksniBroj) entry.getValue();
                    if (fb.getGrad().equals(g)) {
                        setStringova.add(entry.getKey());
                    }
                }
            }

        return setStringova;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> setTelBr = new TreeSet<TelefonskiBroj>();
        if (imenik.isEmpty()) throw new Izuzetak("Prazan imenik!");
            for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
                    if (entry.getValue() instanceof FiksniBroj) {
                        FiksniBroj fb = (FiksniBroj) entry.getValue();
                        if (fb.getGrad().equals(g)) {
                            setTelBr.add(fb);
                        }
            }
        }
            return setTelBr;
    }

}
