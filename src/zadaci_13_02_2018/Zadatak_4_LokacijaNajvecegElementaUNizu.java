package zadaci_13_02_2018;

import java.util.Scanner;

public class Zadatak_4_LokacijaNajvecegElementaUNizu extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi broj redova : ");
		int brojRedova = unos.nextInt();

		System.out.print("Unesi broj kolona : ");
		int brojKolona = unos.nextInt();

		double[][] niz = new double[brojRedova][brojKolona];

		System.out.println("Unesi 2D niz : ");
		for (int i = 0; i < niz.length; i++)
			for (int j = 0; j < niz[i].length; j++)
				niz[i][j] = unos.nextDouble();

		int[] location = locateLargest(niz);

		System.out.print("Lokacija najveceg elementa u 2D nizu je ");
		System.out.print(location[0] + " , " + location[1]);
		System.out.println(" odnosno " + (location[0] + 1) + " , " + (location[1] + 1));

		unos.close();
	}
}
