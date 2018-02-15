package zadaci_15_2_2018;

import java.util.Scanner;

public class Zadatak_3_PalindromBrojevi extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi cijeli : ");
		int broj = unos.nextInt();

		if (isPalindrome(broj))
			System.out.println("Broj " + broj + " je palindrom");
		else
			System.out.println("Broj " + broj + " nije palindrom");

		unos.close();
	}
}
