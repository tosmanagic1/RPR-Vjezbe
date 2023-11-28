package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Pobjednik {

    private String ime;
    private String prezime;
    private Integer brojZnakova;
    private KolekcijaImena kolekcijaImena;

    Pobjednik (KolekcijaImena kI) {
        this.kolekcijaImena = kI;
        String najduzi = kolekcijaImena.getNajduzeIme();
        ArrayList<String> lista = new ArrayList<>();
        for (String s : najduzi.split(" ")) {
            lista.add(s);
        }
        this.ime = lista.get(0);
        this.prezime = lista.get(1);
        this.brojZnakova = this.ime.length();
    }

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

    public Integer getBrojZnakova() {
        return brojZnakova;
    }

    public void setBrojZnakova(Integer brojZnakova) {
        this.brojZnakova = brojZnakova;
    }

    public KolekcijaImena getKolekcijaImena() {
        return kolekcijaImena;
    }

    public void setKolekcijaImena(KolekcijaImena kolekcijaImena) {
        this.kolekcijaImena = kolekcijaImena;
    }
}
