package ba.unsa.etf.rpr;


import java.util.Set;

public class Program {

    public static void main(String[] args) {
        FiksniBroj fb = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "123-456");
        FiksniBroj fb1 = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "123-457");
        FiksniBroj fb2 = new FiksniBroj(FiksniBroj.Grad.BIHAĆ, "123-458");
        FiksniBroj fb3 = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "123-459");
        System.out.println(fb.ispisi());
        MobilniBroj mb = new MobilniBroj(61, "123-456");
        System.out.println(mb.ispisi());
        Imenik imenik = new Imenik();
        imenik.dodaj("Tarik Osmanagić", fb);
        imenik.dodaj("Turkuaz Turkuazović", fb1);
        imenik.dodaj("Tito Josip Broz", fb2);
        imenik.dodaj("Amir Amirović", fb3);
        System.out.println(imenik.dajBroj("Tarik Osmanagić"));
        System.out.println(imenik.dajIme(fb));
        System.out.println(imenik.naSlovo('T'));
        System.out.println(imenik.izGrada(FiksniBroj.Grad.SARAJEVO));
        Set<TelefonskiBroj> TelBr = imenik.izGradaBrojevi(FiksniBroj.Grad.SARAJEVO);
        for (TelefonskiBroj tb : TelBr) {
            System.out.println(tb.ispisi());
        }

        FiksniBroj fb4 = new FiksniBroj(FiksniBroj.Grad.TRAVNIK, "123-460");
        imenik.dodaj("Savo Savanović", fb4);
        System.out.println(imenik.dajIme(fb4));
        Imenik imenik1 = new Imenik();
        try {
            imenik1.izGrada(FiksniBroj.Grad.SARAJEVO);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
