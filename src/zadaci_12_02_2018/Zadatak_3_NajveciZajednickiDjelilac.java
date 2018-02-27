package zadaci_12_02_2018;

import java.util.Scanner;

public class Zadatak_3_NajveciZajednickiDjelilac {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi prvi broj: ");
		int number_1 = unos.nextInt();

		System.out.print("Unesi drugi broj: ");
		int number_2 = unos.nextInt();

		System.out.print("Najveci zajednicki djelilac brojeva " + number_1 + " i " + number_2);
		System.out.println(" je broj " + najveciZajedniciDjelilac(number_1, number_2));
		
		unos.close();
	}

	public static int najveciZajedniciDjelilac(int n1, int n2) {

		for (int i = n1; i > 0; i--) {

			if (n1 % i == 0 && n2 % i == 0)
				return i;
		}
		
		return 0;
	}
}
