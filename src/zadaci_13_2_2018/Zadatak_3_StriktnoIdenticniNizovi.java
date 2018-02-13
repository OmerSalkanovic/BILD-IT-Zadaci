package zadaci_13_2_2018;

import java.util.Scanner;

public class Zadatak_3_StriktnoIdenticniNizovi extends Methods{

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi duzinu prvog niza : ");
		int duzinaNiza_1 = unos.nextInt();

		int[] niz_1 = new int[duzinaNiza_1];

		System.out.print("Unesi niz_1 : ");
		for (int i = 0; i < niz_1.length; i++)
			niz_1[i] = unos.nextInt();

		System.out.print("Unesi duzinu drugog niza : ");
		int duzinaNiza_2 = unos.nextInt();

		int[] niz_2 = new int[duzinaNiza_2];

		System.out.print("Unesi niz_2 : ");
		for (int i = 0; i < niz_2.length; i++)
			niz_2[i] = unos.nextInt();
		
		if(equals(niz_1, niz_2)) System.out.println("Niz 1 i niz 2 su striktno identicni nizovi");
		else System.out.println("Niz 1 i niz 2 nisu striktno identicni nizovi");
		
		unos.close();
	}
}
