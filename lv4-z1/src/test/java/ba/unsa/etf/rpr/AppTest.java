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
    public void testZaVratiPodatkeIzDatotekeXML() throws IOException {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoXMLFile dao2 = new LaptopDaoXMLFile();
        dao2.dodajLaptopUFile(lap);
        ArrayList<Laptop> list2 = dao2.vratiPodatkeIzDatoteke();
        assertEquals("HP", list2.get(0).getBrend());
    }

    @Test
    public void testZaVratiPodatkeIzDatotekeJSON() throws IOException {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoJSONFile dao2 = new LaptopDaoJSONFile();
        dao2.dodajLaptopUFile(lap);
        ArrayList<Laptop> list2 = dao2.vratiPodatkeIzDatoteke();
        assertEquals("HP", list2.get(0).getBrend());
    }

    @Test
    public void daLiBacaIzuzetakSerializable() {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoSerializableFile dao2 = new LaptopDaoSerializableFile();
        dao2.dodajLaptopUListu(lap);
        assertThrows(NeodgovarajuciProcesorException.class, () -> dao2.getLaptop("AMD"), "Ne postoji laptop sa željenim procesorom.");

    }

    @Test
    public void daLiBacaIzuzetakJSON() {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoJSONFile dao2 = new LaptopDaoJSONFile();
        dao2.dodajLaptopUListu(lap);
        assertThrows(NeodgovarajuciProcesorException.class, () -> dao2.getLaptop("AMD"), "Ne postoji laptop sa željenim procesorom.");

    }

    @Test
    public void daLiBacaIzuzetakXML() {
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoXMLFile dao2 = new LaptopDaoXMLFile();
        dao2.dodajLaptopUListu(lap);
        assertThrows(NeodgovarajuciProcesorException.class, () -> dao2.getLaptop("AMD"), "Ne postoji laptop sa željenim procesorom.");

    }

    @Test
    void testMockExternal () {
        //mock setup stage
        Laptop lap = new Laptop("HP", "EliteBook", 1000, 8, 0, 512, "Intel", "NVidia", 320);
        LaptopDaoSerializableFile dao = Mockito.mock(LaptopDaoSerializableFile.class);
        dao.dodajLaptopUListu(lap);
        Laptop lap1 = new Laptop();
        Mockito.when(dao.getLaptop("Intel")).thenReturn(lap1);
        //test stage
        Laptop test = dao.getLaptop("Intel");
        assertEquals(test, lap1);
    }
}
