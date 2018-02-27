package zadaci_21_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_NoK_NoW_NoL extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the file name : ");
		String fileName = input.nextLine() + ".txt";

		ArrayList<String> fileListContent_1 = readNext(fileName);
		String[] fileContent_1 = fileListContent_1.toArray(new String[0]);

		ArrayList<String> fileListContent_2 = readNextLine(fileName);
		String[] fileContent_2 = fileListContent_2.toArray(new String[0]);

		System.out.println("Number of characters in the file is " + numberOfCharacetrsInTheFile(fileContent_2));

		System.out.println("Number of words in the file is " + numberOfWordsInTheFile(fileContent_1));

		System.out.println("Number of lines in the file is " + numberOfLinesInTheFile(fileContent_2));

		input.close();
	}
}
