package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testZaVratiPodatkeIzDatotekeSerializable() throws IOException, ClassNotFoundException {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoSerializableFile dao2 = new LaptopDaoSerializableFile();
        dao2.dodajLaptopUFile(lap);
        ArrayList<Laptop> list2 = dao2.vratiPodatkeIzDatoteke();
        assertEquals("HP", list2.get(0).getBrend());
    }

    @Test
    public void testZaVratiPodatkeIzDatotekeXML() throws IOException, ClassNotFoundException {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoXMLFile dao2 = new LaptopDaoXMLFile();
        dao2.dodajLaptopUFile(lap);
        ArrayList<Laptop> list2 = dao2.vratiPodatkeIzDatoteke();
        assertEquals("HP", list2.get(0).getBrend());
    }

    @Test
    public void testZaVratiPodatkeIzDatotekeJSON() throws IOException, ClassNotFoundException {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoJSONFile dao2 = new LaptopDaoJSONFile();
        dao2.dodajLaptopUFile(lap);
        ArrayList<Laptop> list2 = dao2.vratiPodatkeIzDatoteke();
        assertEquals("HP", list2.get(0).getBrend());
    }
}
