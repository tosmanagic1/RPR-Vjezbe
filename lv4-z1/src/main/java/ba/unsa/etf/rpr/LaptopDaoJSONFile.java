package ba.unsa.etf.rpr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaptopDaoJSONFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile () {
        try {
            ObjectMapper mapper = new ObjectMapper();
            this.file = new File("laptopi.json");
            this.laptopi = mapper.readValue(this.file, new TypeReference<ArrayList<Laptop>>(){});
        } catch (IOException e) {
            this.laptopi = new ArrayList<Laptop>();
        }
    }

    @Override
    public void dodajLaptopUListu (Laptop laptop) {
        this.laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile (Laptop laptop) throws IOException {
        dodajLaptopUListu(laptop);
        ObjectMapper mapper = new ObjectMapper();
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
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Laptop> lista_laptopa = mapper.readValue(this.file, new TypeReference<ArrayList<Laptop>>(){});
        return lista_laptopa;
    }
}
