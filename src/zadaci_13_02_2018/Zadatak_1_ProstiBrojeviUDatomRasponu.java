package zadaci_13_02_2018;

import java.util.Scanner;

public class Zadatak_1_ProstiBrojeviUDatomRasponu extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi donju granicu: ");
		int donjaGranica = unos.nextInt();
		
		System.out.print("Unesi gronju granicu: ");
		int gronjaGranica = unos.nextInt();
		
		System.out.print("Koliko brojeva zelite printati po jednom redu ? ");
		int endl = unos.nextInt();
		
		printPrimeNumbers(donjaGranica, gronjaGranica, endl);
		
		unos.close();
	}
}
