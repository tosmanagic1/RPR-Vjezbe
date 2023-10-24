package ba.unsa.etf.rpr;

public class Racun {

    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;

    Racun (Long broj, Osoba osoba) {

    }

    public void setbrojRacuna (Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Long getbrojRacuna () {
        return this.brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    private boolean provjeriOdobrenjePrekoracenja (Double prekoracenje) {
        return true;
    }

    public boolean izvrsiUplatu (Double uplata) {
        return true;
    }

    public boolean izvrsiIsplatu (Double isplata) {
        return true;
    }

    public void odobriPrekoracenje (Double prekoracenje) {

    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
}
