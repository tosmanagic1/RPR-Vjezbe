package ba.unsa.etf.rpr;

public class SinusAndFaktorijel {

    public static double sinus(double input){
        double sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += power(-1, i) * (power(input, 2 * i + 1) / faktorijel(2 * i + 1));
        }
        return sum;
    }
    public static double faktorijel (double n) {

        if (n < 0 || (n - (int)(n)) != 0) {
            throw new IllegalArgumentException("Nelegalan argument za faktorijel!");
        }
        double faktorijel = 1;
        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
        }
        return faktorijel;
    }

    public static double power(double input, int pow){
        double product = 1;
        for(int i=0; i<pow; i++){
            product *= input;
        }
        return product;
    }
}
