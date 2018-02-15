package zadaci_15_2_2018;

public class Methods {

	public static double duzinaPiste(double v, double a) {
		return (v * v) / (2 * a);
	}

	public static void karakteriNaNeparnimPozicijama(String s) {

		for (int i = 0; i < s.length(); i++)
			if (i % 2 == 0)
				System.out.print(s.charAt(i));

	}

	public static int reverse(int number) {

		int copyNumber = number, number_2 = 0, e = 1;

		while (copyNumber > 10) {
			e = e * 10;
			copyNumber = copyNumber / 10;
		}

		copyNumber = number;

		while (copyNumber > 0) {

			number_2 = ((copyNumber % 10) * e) + number_2;
			copyNumber = copyNumber / 10;
			e = e / 10;
		}

		return number_2;
	}

	public static boolean isPalindrome(int number) {

		if (number == reverse(number))
			return true;
		else
			return false;
	}

	public static void ispisiPrestupneGodine(int dg, int gg) {

		int endl = 0;

		for (int i = dg; i <= gg; i++)
			if (i % 100 != 0 && i % 4 == 0 || i % 100 == 0 && i % 400 == 0) {
				endl++;
				System.out.print(i + " ");
				if (endl % 10 == 0)
					System.out.println();
			}
	}

	public static double iznosInvesticije(double iznosInvesticije, double interesnaStopa, int brojGodina) {
		return iznosInvesticije * (Math.pow((1 + (interesnaStopa / 1200)), (brojGodina * 12)));
	}
}
