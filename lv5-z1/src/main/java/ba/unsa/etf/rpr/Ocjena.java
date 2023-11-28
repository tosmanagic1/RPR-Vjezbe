package ba.unsa.etf.rpr;

public class Ocjena {
    private LicneInformacije osoba;
    private Integer ocjena;

    Ocjena (LicneInformacije osoba, Integer ocjena) {
        try {
            setOcjena(ocjena);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        this.osoba = osoba;
    }

    public void setOcjena(Integer ocjena) throws Exception{
        if (ocjena < 0 || ocjena > 10) throw new IllegalArgumentException();
        else {
            this.ocjena = ocjena;
        }
    }
}
