package ba.unsa.etf.rpr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException {

        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoJSONFile dao = new LaptopDaoJSONFile();
        LaptopDaoXMLFile dao1 = new LaptopDaoXMLFile();
        LaptopDaoSerializableFile dao2 = new LaptopDaoSerializableFile();
        Laptop lap1 = new Laptop();
        lap1.setBrend("Apple");
        lap1.setModel("Mekintos");
        lap1.setGrafickaKartica("NVIDIA");
        lap1.setProcesor("Intel i5");
        dao.dodajLaptopUFile(lap1);
        dao.dodajLaptopUFile(lap);
        dao1.dodajLaptopUFile(lap1);
        dao1.dodajLaptopUFile(lap);
        dao2.dodajLaptopUFile(lap1);
        dao2.dodajLaptopUFile(lap);
        ArrayList<Laptop> list = dao.vratiPodatkeIzDatoteke();
        ArrayList<Laptop> list1 = dao1.vratiPodatkeIzDatoteke();
        ArrayList<Laptop> list2 = dao2.vratiPodatkeIzDatoteke();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getBrend() + "1");
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getBrend() + "2");
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).getBrend() + "3");
        }
    }
}
