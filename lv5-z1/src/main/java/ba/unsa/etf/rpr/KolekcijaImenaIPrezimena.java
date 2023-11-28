package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class KolekcijaImenaIPrezimena {

    private ArrayList<String> imena;
    private ArrayList<String> prezimena;

    KolekcijaImenaIPrezimena () {
        imena = new ArrayList<>();
        prezimena = new ArrayList<>();
    }

    public ArrayList<String> getImena() {
        return imena;
    }

    public void setImena(ArrayList<String> imena) {
        this.imena = imena;
    }

    public ArrayList<String> getPrezimena() {
        return prezimena;
    }

    public void setPrezimena(ArrayList<String> prezimena) {
        this.prezimena = prezimena;
    }

    public int getIndexNajduzegPara () {
        String najduzeIme = imena.get(0);
        String najduzePrezime = prezimena.get(0);
        String najduzeImeIPrezime = imena.get(0) + " " + prezimena.get(0);
        int index = 0;
        for (int i = 0; i < imena.size(); i++) {
            if (imena.get(i) .length() > najduzeIme.length()) najduzeIme = imena.get(i);
            if (prezimena.get(i).length() > najduzePrezime.length()) najduzePrezime = prezimena.get(i);
            if (najduzeIme.length() + najduzePrezime.length() > najduzeImeIPrezime.length()) index = i;
        }
        return index;
    }

    public String getImeiPrezime(int i) {
        return imena.get(i) + " " + prezimena.get(i);
    }
}
