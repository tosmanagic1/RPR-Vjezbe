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
}
