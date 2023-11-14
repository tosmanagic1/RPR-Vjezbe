package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoXMLFile implements LaptopDao {
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoXMLFile () {

        XmlMapper mapper = new XmlMapper();
        this.file = new File("laptopi.xml");
        try {
            this.laptopi = mapper.readValue(this.file, new TypeReference<ArrayList<Laptop>>(){});
        } catch (IOException e) {
            this.laptopi = new ArrayList<Laptop>();
            // ignore exception and create empty list
        }
    }
    @Override
    public void dodajLaptopUListu (Laptop laptop) {
        this.laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile (Laptop laptop) throws IOException {
        dodajLaptopUListu(laptop);
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(this.file, this.laptopi);
    }

    @Override
    public Laptop getLaptop (String procesor) {
        for(Laptop laptop : this.laptopi){
            if (laptop.getProcesor().equals(procesor)){
                return laptop;
            }
        }
        return null;
    }

    @Override
    public void napuniListu (ArrayList<Laptop> laptopi) {
        this.laptopi.addAll(laptopi);
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException {
        XmlMapper mapper = new XmlMapper();
        ArrayList<Laptop> lista_laptopa = mapper.readValue(this.file, new TypeReference<ArrayList<Laptop>>(){});
        return lista_laptopa;
    }
}
