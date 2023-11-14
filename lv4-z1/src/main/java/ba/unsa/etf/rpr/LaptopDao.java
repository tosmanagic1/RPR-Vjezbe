package ba.unsa.etf.rpr;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public interface LaptopDao extends Serializable {

    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop) throws IOException;
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException, ClassNotFoundException;
}
