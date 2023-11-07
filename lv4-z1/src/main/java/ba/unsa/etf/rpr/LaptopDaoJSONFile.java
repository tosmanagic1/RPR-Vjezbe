package ba.unsa.etf.rpr;

import java.io.File;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{
    File file;
    ArrayList<Laptop> laptopi;

    @Override
    public ArrayList<Laptop> dodajLaptopUListu(Laptop laptop) {
        return null;
    }

    @Override
    public File dodajLaptopUFile(Laptop laptop) {
        return null;
    }

    @Override
    public Laptop getLaptop(String procesor) {
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {
        return null;
    }
}
