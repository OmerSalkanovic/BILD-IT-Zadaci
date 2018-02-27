package zadaci_15_02_2018;

import java.util.Scanner;

public class Zadatak_2_PrestupneGodine extends Methods {

	public static void main(String[] args) {
		runApp();
	}
	
	public static void runApp() {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi donju granicu : ");
		int donjaGranica = unos.nextInt();
		
		System.out.print("Unesi gornju granicu : ");
		int gornjaGranica = unos.nextInt();
		
		ispisiPrestupneGodine(donjaGranica, gornjaGranica);
		
		unos.close();
	}
}
