package ba.unsa.etf.rpr;



public class Korisnik extends Osoba{


    private Racun racun;

    public Korisnik (String ime, String prezime) {
        super();
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public void dodajRacun (Racun noviracun) {

    }


}
