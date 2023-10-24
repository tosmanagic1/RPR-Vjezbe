package ba.unsa.etf.rpr;

import java.util.List;

public class Banka {

    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka() {

    }

    public Korisnik kreirajNovogKorisnika (String ime, String prezime) {
        return new Korisnik("Tarik", "Osmanagić");
    }

    public Uposlenik kreirajNovogUposlenika (String ime, String prezime) {
        return new Uposlenik("Tarik", "Osmanagić");
    }

    public Racun kreirajRacunZaKorisnika (Korisnik korisnik) {
        return new Racun(1L, new Osoba());
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
}
