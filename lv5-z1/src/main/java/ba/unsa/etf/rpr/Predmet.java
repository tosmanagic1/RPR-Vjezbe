package ba.unsa.etf.rpr;

public class Predmet implements Predstavi {
    private String naziv;
    private String opis;

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
