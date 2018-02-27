package zadaci_21_02_2018;

import java.util.Scanner;

public class Zadatak_7_PreLastWordOfLine extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the file name : ");
		String fileName = input.nextLine() + ".txt";
		
		String[] lines = readNextLine(fileName).toArray(new String[0]);
		String[] words = readNext(fileName).toArray(new String[0]);
		
		printPreLastWordInTheLine(lines, words);

		input.close();
	}
}
