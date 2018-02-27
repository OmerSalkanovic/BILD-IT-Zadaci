package zadaci_14_02_2018;

import java.util.Scanner;

public class Zadatak_1_StanjeRacuna extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi mjesecni iznos stednje : ");
		double mjesecniIznosStednje = unos.nextInt();

		System.out.print("Broj mjeseci nakon koliko zelite saznati stanje racuna : ");
		int brojMjeseci = unos.nextInt();

		System.out.println("Stanje vaseg racuna iznosi : " + stanjeRacuna(mjesecniIznosStednje, brojMjeseci));

		unos.close();
	}
}
