package zadaci_13_2_2018;

import java.util.Scanner;

public class Zadatak_5_SortiranjeRedovaU2DNizu extends Methods {

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

		double[][] array = sortRows(niz);
		print2DArray(array);
		
		unos.close();
	}
}
