package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopDaoSerializableFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Laptop> getLaptopi() {
        return laptopi;
    }

    public void setLaptopi(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    public LaptopDaoSerializableFile () {

        this.file = new File("laptopi.txt");
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.file));
            ArrayList<Laptop> o = (ArrayList<Laptop>) in.readObject();
            this.laptopi = o;
        } catch (Exception e) {
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
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.file));
        out.writeObject(this.laptopi);
        out.close();
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
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.file));
        ArrayList<Laptop> o = (ArrayList<Laptop>) in.readObject();
        return o;
    }
}
