package zadaci_21_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_2_NumberOfLetterRepeat extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the file name : ");
		String fileName = input.nextLine() + ".txt";

		ArrayList<String> fileListContent = readNextLine(fileName);
		String[] fileContent = fileListContent.toArray(new String[0]);

		int[][] repeats = numberOfLetterRepeat(fileContent);

		for (int i = 0; i < repeats[0].length; i++) {
			char ch = (char) (65 + i);
			System.out.println("The letter " + ch + " has been repeated in the file " + repeats[0][i] + " times");
		}

		for (int i = 0; i < repeats[1].length; i++) {
			char ch = (char) (97 + i);
			System.out.println("The letter " + ch + " has been repeated in the file " + repeats[1][i] + " times");
		}

		input.close();
	}
}
