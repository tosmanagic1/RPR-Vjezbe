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
        return 0;
    }

    public String getImeiPrezime(int i) {
        return null;
    }
}
