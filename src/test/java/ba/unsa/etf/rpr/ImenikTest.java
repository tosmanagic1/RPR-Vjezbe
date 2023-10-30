package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Set;

import static ba.unsa.etf.rpr.FiksniBroj.Grad.*;
import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {

    @Test
    void dodaj() {
        Imenik imenik = new Imenik();
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        imenik.dodaj("Hana Hanic", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-456"));
        assertEquals("033/123-456", imenik.dajBroj("Meho Mehic"));
    }

    @Test
    void naSlovo() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        assertEquals("1. Ivo Ivic - 061/321-645", imenik.naSlovo('I').trim());
    }
    @Test
    void izGrada() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<String> set = imenik.izGrada(SARAJEVO);
        String result = "";
        for (String ime : set) {
            result += ime + ",";
        }
        assertEquals("Ivo Ivic,Meho Mehic,Sara Sarac,", result);
    }
    @Test
    void izGradaBrojevi() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<TelefonskiBroj> set = imenik.izGradaBrojevi(SARAJEVO);
        String result = "";
        for (TelefonskiBroj broj : set) {
            result += broj.ispisi() + ",";
        }
        assertEquals("033/123-156,033/123-456,033/123-656,", result);
    }

    @Test
    void dajBroj () {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Josip Josipović", new MobilniBroj(61, "123-457"));
        imenik.dodaj ("Savo Svić", new FiksniBroj(TRAVNIK, "123-458"));
        assertEquals ("061/123-457", imenik.dajBroj("Josip Josipović"));
    }

    @Test
    void dajIme () {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Josip Josipović", new MobilniBroj(61, "123-457"));
        imenik.dodaj ("Savo Savić", new FiksniBroj(TRAVNIK, "123-458"));
        MobilniBroj mb = new MobilniBroj(61, "123-457");
        assertEquals("Josip Josipović", imenik.dajIme(mb));
        assertEquals("Savo Savić", imenik.dajIme(new FiksniBroj(TRAVNIK, "123-458")));
    }

    @Test

    void prazanImenik () {
        Imenik imenik = new Imenik();
        assertThrows(Izuzetak.class, () -> imenik.izGrada(SARAJEVO), "Prazan imenik!");
    }

    @Test
    void testMockExternal () {
        //mock setup stage
        Imenik i = Mockito.mock(Imenik.class);
        i.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        i.dodaj("Josip Josipović", new MobilniBroj(61, "123-457"));
        i.dodaj ("Savo Savić", new FiksniBroj(TRAVNIK, "123-458"));
        Mockito.when(i.dajBroj("Ivo Ivic")).thenReturn("Nema nista");
        //test stage
        String test = i.dajBroj("Ivo Ivic");
        assertEquals(test, "Nema nista");
    }


}
