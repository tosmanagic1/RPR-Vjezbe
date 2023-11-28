package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class KolekcijaImena {
    private ArrayList<String> listaStringova;

    public String getNajduzeIme() {
        String najduziString = listaStringova.get(0);
        for (String element : listaStringova) {
            if (element.length() > najduziString.length()) {
                najduziString = element;
            }
        }
        return najduziString;
    }

    KolekcijaImena () {
        this.listaStringova = new ArrayList<>();
    }

    public ArrayList<String> getListaStringova() {
        return listaStringova;
    }

    public void setListaStringova(ArrayList<String> listaStringova) {
        this.listaStringova = listaStringova;
    }
}
