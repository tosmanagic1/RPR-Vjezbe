package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        InformacijeONastavku iON = new InformacijeONastavku();
        InformacijeOStudentu iOS = new InformacijeOStudentu();
        LicneInformacije lI = new LicneInformacije();
        Predmet p = new Predmet();




        lI.setIme("Tarik");
        lI.setPrezime("Osmanagić");

        iON.setIme("Novak");
        iON.setPrezime("Đoković");
        iON.setTitula("Redovni Profesor");

        iOS.setIme("Meho");
        iOS.setPrezime("Mehić");
        iOS.setBrojIndexa("12345");
        iOS.setGodinaStudija("Treca godina");

        p.setNaziv("Razvoj programskih rješenja");
        p.setOpis("Programiranje");

        List<Predstavi> lista = new ArrayList<Predstavi>();
        lista.add(lI);
        lista.add(iON);
        lista.add(iOS);
        lista.add(p);
        KolekcijaPoruka kP = new KolekcijaPoruka(lista);

        for (int i = 0; i < kP.getPoruke().size(); i++) {
            System.out.println(kP.getPoruke().get(i));
        }
    }
}
