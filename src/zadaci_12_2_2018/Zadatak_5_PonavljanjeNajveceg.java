package zadaci_12_2_2018;

import java.util.Scanner;

public class Zadatak_5_PonavljanjeNajveceg {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);
		int brojPonavljanja = 0, number = 0, max = 0;

		do {

			System.out.print("Unesi broj: ");
			number = unos.nextInt();

			if (number > max) {

				max = number;
				brojPonavljanja = 1;

			} else if (number == max) {

				brojPonavljanja++;
			}

		} while (number != 0);

		System.out.print("Najveæi uneseni broj je : " + max);
		System.out.println(" i on se pojavio " + brojPonavljanja + " puta");

		unos.close();
	}
}
