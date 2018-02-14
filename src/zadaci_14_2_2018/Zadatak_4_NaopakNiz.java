package zadaci_14_2_2018;

import java.util.Scanner;

public class Zadatak_4_NaopakNiz extends Methods{

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		int[] array = new int[10];
		
		System.out.print("Unesi deset cijelih brojeva : ");
		for (int i = 0; i < array.length; i++)
			array[i] = unos.nextInt();

		ispisiNizNaopako(array);
		
		unos.close();
	}
}
