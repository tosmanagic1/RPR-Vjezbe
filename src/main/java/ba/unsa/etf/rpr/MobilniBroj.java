package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + this.mobilnaMreza + "/" + this.broj;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.mobilnaMreza);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MobilniBroj)) {
            return false;
        }

        MobilniBroj tb = (MobilniBroj) o;

        if (this.mobilnaMreza == tb.mobilnaMreza && this.broj.equals(tb.broj)) {
            return true;
        }
        return false;
    }
}
