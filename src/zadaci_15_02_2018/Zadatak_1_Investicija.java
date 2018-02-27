package zadaci_15_02_2018;

import java.util.Scanner;

public class Zadatak_1_Investicija extends Methods {

	public static void main(String[] args) {
		runApp();
	}
	
	public static void runApp() {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi iznos investicije : ");
		double iznosInvesticije = unos.nextDouble();
		
		System.out.print("Unesi godisnju interesnu stopu : ");
		double godisnjaInteresnaStopa = unos.nextDouble();
		
		System.out.print("Unesi broj godina : ");
		int brojGodina = unos.nextInt();
		
		System.out.println("Iznos investicije iznosi : " + iznosInvesticije(iznosInvesticije, godisnjaInteresnaStopa, brojGodina));
		
		unos.close();
	}
}
