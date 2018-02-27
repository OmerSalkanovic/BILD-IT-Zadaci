package zadaci_21_02_2018;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

	public static ArrayList<String> readNext(String fileName) {

		try {

			Scanner reader = new Scanner(new File(fileName));

			ArrayList<String> fileContent = new ArrayList<String>();

			while (reader.hasNext())
				fileContent.add(reader.next());

			reader.close();

			return fileContent;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static ArrayList<String> readNextLine(String fileName) {

		try {

			Scanner reader = new Scanner(new File(fileName));

			ArrayList<String> fileContent = new ArrayList<String>();

			while (reader.hasNextLine())
				fileContent.add(reader.nextLine());

			reader.close();

			return fileContent;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static int numberOfCharacetrsInTheFile(String[] fileContent) {

		int numberOfCharacters = 0;

		for (int i = 0; i < fileContent.length; i++) {
			for (int j = 0; j < fileContent[i].length(); j++) {
				numberOfCharacters++;
			}
		}

		return numberOfCharacters;
	}

	public static int numberOfWordsInTheFile(String[] fileContent) {
		return fileContent.length;
	}

	public static int numberOfLinesInTheFile(String[] fileContent) {
		return fileContent.length;
	}

	public static int[][] numberOfLetterRepeat(String[] fileContent) {

		int[][] repeats = new int[2][26];

		for (int i = 0; i < fileContent.length; i++)
			for (int j = 0; j < fileContent[i].length(); j++)
				if (Character.isUpperCase(fileContent[i].charAt(j)))
					repeats[0][fileContent[i].charAt(j) - 'A']++;
				else if (Character.isLowerCase(fileContent[i].charAt(j)))
					repeats[1][fileContent[i].charAt(j) - 'a']++;

		return repeats;
	}

	public static void saveFile(String[] array) {

		try {

			PrintWriter writer = new PrintWriter(new FileWriter("Zadaci.txt"));

			for (int i = 0; i < array.length - 1; i++) {
				writer.println(array[i]);
			}
			writer.print(array[array.length - 1]);

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printStringBack(String[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = array[i].length() - 1; j >= 0; j--)
				System.out.print(array[i].charAt(j));
			System.out.println();
		}
	}

	public static void printSentencesBack(String[] lines, String[] words) {

		int numberOfWordsInTheLines = 0;
		int previousNumberOfWordsInTheLines = 0;

		for (int i = 0; i < lines.length; i++) {

			for (int j = 0; j < lines[i].length(); j++)
				if (lines[i].charAt(j) == ' ')
					numberOfWordsInTheLines++;

			numberOfWordsInTheLines++;

			for (int j = numberOfWordsInTheLines - 1; j >= previousNumberOfWordsInTheLines; j--)
				if (lines[i].contains(words[j]))
					System.out.print(words[j] + " ");

			System.out.println();

			previousNumberOfWordsInTheLines = numberOfWordsInTheLines;
		}
	}

	public static void printLongestWordInTheLine(String[] lines, String[] words) {

		int numberOfWordsInTheLines = 0;
		int previousNumberOfWordsInTheLines = 0;

		for (int i = 0; i < lines.length; i++) {

			for (int j = 0; j < lines[i].length(); j++)
				if (lines[i].charAt(j) == ' ')
					numberOfWordsInTheLines++;

			numberOfWordsInTheLines++;

			String longestWord = words[numberOfWordsInTheLines - 1];

			for (int j = numberOfWordsInTheLines - 1; j >= previousNumberOfWordsInTheLines; j--)
				if (lines[i].contains(words[j]) && words[j].compareTo(longestWord) > 0)
					longestWord = words[j];

			System.out.println(longestWord);

			previousNumberOfWordsInTheLines = numberOfWordsInTheLines;
		}
	}

	public static void printPreLastWordInTheLine(String[] lines, String[] words) {

		int numberOfWordsInTheLines = 0;

		for (int i = 0; i < lines.length; i++) {

			for (int j = 0; j < lines[i].length(); j++)
				if (lines[i].charAt(j) == ' ')
					numberOfWordsInTheLines++;

			numberOfWordsInTheLines++;

			System.out.println(words[numberOfWordsInTheLines - 2]);
		}
	}

	public static void printSentencesWithoutSpaces(String[] lines) {

		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length(); j++)
				if (lines[i].charAt(j) != ' ')
					System.out.print(lines[i].charAt(j));
			System.out.println();
		}
	}

	public static String[] upperCase(String[] lines) {

		String[] modifaedLines = new String[lines.length];

		for (int i = 0; i < lines.length; i++) {
			modifaedLines[i] = "";
			for (int j = 0; j < lines[i].length(); j++) {

				if (j == 0) {
					char ch = Character.toUpperCase(lines[i].charAt(j));
					modifaedLines[i] = modifaedLines[i] + ch;
				} else if (lines[i].charAt(j) == ' ') {
					char ch = Character.toUpperCase(lines[i].charAt(j + 1));
					modifaedLines[i] = modifaedLines[i] + " " + ch;
					j++;
				} else
					modifaedLines[i] = modifaedLines[i] + lines[i].charAt(j);
			}
		}
		return modifaedLines;
	}

	public static void cutLines(String[] lines) {

		for (int i = 0; i < lines.length; i++) {
			if (lines[i].length() < 55)
				System.out.println(lines[i]);
			else {
				for (int j = 0; j < 40; j++)
					System.out.print(lines[i].charAt(j));
				System.out.println("... <Read More>");
			}
		}
	}

	public static void printOddNumbers(String fileName) {

		try {

			Scanner reader = new Scanner(new File(fileName));

			while (reader.hasNextInt()) {
				int number = reader.nextInt();
				if (number % 2 != 0)
					System.out.print(number + " ");
			}

			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
