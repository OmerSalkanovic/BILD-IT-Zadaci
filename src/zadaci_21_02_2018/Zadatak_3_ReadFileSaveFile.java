package zadaci_21_02_2018;

import java.util.Scanner;

public class Zadatak_3_ReadFileSaveFile extends Methods {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the string : ");
		String s = input.nextLine();

		String[] fileContent = readNextLine("Zadaci.txt").toArray(new String[0]);
		String[] stringArray = new String[fileContent.length + 1];

		for (int i = 0; i < fileContent.length; i++)
			stringArray[i] = fileContent[i];
		
		stringArray[stringArray.length - 1] = s;

		saveFile(stringArray);
		printStringBack(stringArray);
		
		input.close();
	}
}
