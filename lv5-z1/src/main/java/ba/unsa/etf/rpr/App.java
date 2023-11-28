package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        /*List<Predstavi> lista = new ArrayList<Predstavi>();
        lista.add(lI);
        lista.add(iON);
        lista.add(iOS);
        lista.add(p);
        KolekcijaPoruka kP = new KolekcijaPoruka(lista);

        for (int i = 0; i < kP.getPoruke().size(); i++) {
            System.out.println(kP.getPoruke().get(i));
        }


        */

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Da li ste student ili nastavnik? Unesite (S za studenta, N za nastavnika, 0 za kraj): ");
        for (;;) {
            if (ulaz.nextLine().equals("S")) {
                System.out.println("Nastavnik: " + iON.getTitula()+ " " + iON.getIme() + " " + iON.getPrezime() + "\nUnesite ocjenu za nastavnika: " );
                Integer x = ulaz.nextInt();
                Ocjena ocjenaStudentaZaNastavnika = iOS.ocijeni(x);
                iON.setLista_ocjena(ocjenaStudentaZaNastavnika);
                System.out.println("Predmet: " + p.getNaziv() + "\nUnesite ocjenu za predmet: ");
                x = ulaz.nextInt();
                Ocjena ocjenaStudentaZaPredmet = iOS.ocijeni(x);
                p.setLista_ocjena(ocjenaStudentaZaPredmet);
            }

            else if (ulaz.nextLine().equals("N")) {
                System.out.println("Predmet: " + p.getNaziv() + "\n");
                System.out.println("Unesite ocjenu za predmet: ");
                Integer x = ulaz.nextInt();
                Ocjena ocjenaNastavnikaZaPredmet = iON.ocijeni(x);
                p.setLista_ocjena(ocjenaNastavnikaZaPredmet);
            }
            else if (ulaz.nextInt() == 0) break;
        }




    }
}
