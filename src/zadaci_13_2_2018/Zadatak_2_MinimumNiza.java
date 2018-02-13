package zadaci_13_2_2018;

import java.util.Scanner;

public class Zadatak_2_MinimumNiza extends Methods {

	public static void main(String[] args) {
		runApp();
	}
	
	public static void runApp() {
		
		Scanner unos = new Scanner(System.in);
		
		double[] array = new double[10];
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Unesi " + (i+1) + " element niza: ");
			array[i] = unos.nextDouble();
		}
		
		System.out.println("Najmanji element niza je " + min(array));
		
		unos.close();
	}
}
