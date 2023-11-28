package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class InformacijeONastavku extends LicneInformacije implements Predstavi, MozeOcijeniti{
    private String ime;
    private String prezime;
    private String titula;

    private ArrayList<Ocjena> lista_ocjena;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String predstavi() {
        return "Informacije o Nastavniku";
    }

    @Override
    public Ocjena ocijeni(Integer x) {
        return null;
    }
}
