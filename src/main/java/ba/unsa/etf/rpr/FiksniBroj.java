package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{

    public enum Grad { SARAJEVO ("033"),
                TUZLA ("035"),
                ZENICA ("032"),
                TRAVNIK ("030"),
                ODŽAK ("031"),
                LIVNO ("034"),
                MOSTAR ("036"),
                BIHAĆ ("037"),
                POSUŠJE ("039"),
                BRČKO ("049");
        private final String pozivni;
        private Grad(String pozivni) {
            this.pozivni = pozivni;
        }

        @Override
        public String toString() { return pozivni; }
    }

    private Grad grad;
    private String broj;

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi () {
        return this.grad.pozivni + "/" + this.broj;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.grad.pozivni);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FiksniBroj)) {
            return false;
        }

        FiksniBroj fb = (FiksniBroj) o;

        if (this.grad.equals(fb.grad)  && this.broj.equals(fb.broj)) {
            return true;
        }
        return false;
    }

}
