package zadaci_15_2_2018;

import java.util.Scanner;

public class Zadatak_5_DuzinaPiste extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi brzinu aviona (m/s) : ");
		double brzinaAviona = unos.nextDouble();

		System.out.print("Unesi ubrzanje aviona (m/s^2) : ");
		double ubrzanjeAviona = unos.nextDouble();

		System.out.println("Duzina piste iznosi : " + duzinaPiste(brzinaAviona, ubrzanjeAviona));

		unos.close();
	}
}
