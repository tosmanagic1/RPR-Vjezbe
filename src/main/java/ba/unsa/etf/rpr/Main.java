package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara (int a) {
        int n = a;
        int suma = 0;
        while (n != 0) {
           int cifra = n%10;
           suma += cifra;
           n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = ulaz.nextInt();
        System.out.println("Brojevi izmedju " + 1 + " i " + n + " koji su djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i%sumaCifara(i)==0) {
                System.out.println(i);
            }
        }
    }
}
