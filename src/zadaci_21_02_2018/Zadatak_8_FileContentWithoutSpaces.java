package zadaci_21_02_2018;

import java.util.Scanner;

public class Zadatak_8_FileContentWithoutSpaces extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the file name : ");
		String fileName = input.nextLine() + ".txt";

		String[] lines = readNextLine(fileName).toArray(new String[0]);

		printSentencesWithoutSpaces(lines);

		input.close();
	}
}
