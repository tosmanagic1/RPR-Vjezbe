package ba.unsa.etf.rpr;

public class InformacijeOStudentu extends LicneInformacije implements Predstavi, MozeOcijeniti{

    private String ime;
    private String prezime;
    private String godinaStudija;
    private String brojIndexa;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    @Override
    public String predstavi() {
        return "Informacije o Studentu";
    }

    @Override
    public Ocjena ocijeni(Integer x) {
        return null;
    }
}
