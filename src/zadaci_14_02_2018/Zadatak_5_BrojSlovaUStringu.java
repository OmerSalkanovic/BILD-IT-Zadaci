package zadaci_14_02_2018;

import java.util.Scanner;

public class Zadatak_5_BrojSlovaUStringu extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi string : ");
		String string = unos.nextLine();

		System.out.println("Broj slova u stringu je : " + borojSlovaUStringu(string));

		unos.close();
	}
}
