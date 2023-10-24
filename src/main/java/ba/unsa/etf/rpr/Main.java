package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if(args.length!=0) {
            if(args[0].equals("sinus"))
            {
                System.out.println(SinusAndFaktorijel.sinus(Double.parseDouble(args[1])));
            }
            else {
                System.out.println(SinusAndFaktorijel.faktorijel(Double.parseDouble(args[1])));
            }
        }

    }
}