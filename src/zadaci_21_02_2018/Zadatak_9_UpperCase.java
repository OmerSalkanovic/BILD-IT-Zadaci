package zadaci_21_02_2018;

import java.util.Scanner;

public class Zadatak_9_UpperCase extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the file name : ");
		String fileName = input.nextLine() + ".txt";

		String[] lines = readNextLine(fileName).toArray(new String[0]);
		String[] modifaedLines = upperCase(lines);

		for (int i = 0; i < modifaedLines.length; i++)
			System.out.println(modifaedLines[i]);

		input.close();
	}
}
