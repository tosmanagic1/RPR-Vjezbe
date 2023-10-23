import java.util.Scanner;

public class UnosDvaCijelaBroja {
	public static void main (String[] args) {
		System.out.println("Unesite prvi cijeli broj: ");
		Scanner ulaz = new Scanner(System.in);
		int x1 = ulaz.nextInt();
		System.out.println("Unesite drugi cijeli broj: ");
		int x2 = ulaz.nextInt();
		System.out.println("Unijeli ste ova dva cijela broja: " + x1 + " i " + x2);
	}
}