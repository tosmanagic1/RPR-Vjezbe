package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet implements Predstavi {
    private String naziv;
    private String opis;

    private ArrayList<Ocjena> lista_ocjena;

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public String predstavi() {
        return "Informacije o Predmetu";
    }
}
