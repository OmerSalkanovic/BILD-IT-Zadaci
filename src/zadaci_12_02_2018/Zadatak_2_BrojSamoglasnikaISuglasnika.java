package zadaci_12_02_2018;

import java.util.Scanner;

public class Zadatak_2_BrojSamoglasnikaISuglasnika {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi string: ");
		String s = unos.nextLine();
		s.toLowerCase();

		int brojSamoglasnika = 0, brojSuglasnika = 0;

		for (int i = 0; i < s.length(); i++)

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
				brojSamoglasnika++;
			else if (Character.isLetter(s.charAt(i)))
				brojSuglasnika++;

		System.out.println("Broj samoglasnika je " + brojSamoglasnika);
		System.out.println("Broj suglasnika je " + brojSuglasnika);
		
		unos.close();
	}
}
