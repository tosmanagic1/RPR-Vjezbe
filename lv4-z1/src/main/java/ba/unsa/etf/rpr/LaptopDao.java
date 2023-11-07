package ba.unsa.etf.rpr;

import java.io.File;
import java.util.ArrayList;

public interface LaptopDao {

    ArrayList<Laptop> dodajLaptopUListu(Laptop laptop);
    File dodajLaptopUFile(Laptop laptop);
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    ArrayList<Laptop> vratiPodatkeIzDatoteke();
}
