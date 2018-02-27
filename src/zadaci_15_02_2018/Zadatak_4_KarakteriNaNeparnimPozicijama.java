package zadaci_15_02_2018;

import java.util.Scanner;

public class Zadatak_4_KarakteriNaNeparnimPozicijama extends Methods {

	public static void main(String[] args) {
		runApp();
	}
	
	public static void runApp() {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi string : ");
		String s = unos.nextLine();
		
		karakteriNaNeparnimPozicijama(s);
		
		unos.close();
	}
}
