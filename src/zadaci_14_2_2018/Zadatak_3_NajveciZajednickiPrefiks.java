package zadaci_14_2_2018;

import java.util.Scanner;

public class Zadatak_3_NajveciZajednickiPrefiks extends Methods{

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi string 1 : ");
		String string_1 = unos.nextLine();

		System.out.print("Unesi string 2 : ");
		String string_2 = unos.nextLine();

		System.out.print("Najveci zajednica prefiks stringova je : ");
		System.out.println(najveciZajednickiPrefiks(string_1, string_2));
		
		unos.close();
	}
}
