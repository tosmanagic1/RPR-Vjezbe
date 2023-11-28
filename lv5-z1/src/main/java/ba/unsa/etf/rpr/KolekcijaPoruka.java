package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka  {

    private ArrayList<String> poruke = new ArrayList<>();

    public ArrayList<String> getPoruke() {
        return poruke;
    }

        KolekcijaPoruka (List<Predstavi> listaPoruka) {

        for (int i = 0; i < listaPoruka.size(); i++) {
            poruke.add(listaPoruka.get(i).predstavi());
        }
    }


}
