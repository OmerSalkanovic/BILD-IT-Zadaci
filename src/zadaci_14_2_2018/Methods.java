package zadaci_14_2_2018;

public class Methods {

	public static int borojSlovaUStringu(String s) {

		int brojSlova = 0;

		for (int i = 0; i < s.length(); i++)
			if (Character.isLetter(s.charAt(i)))
				brojSlova++;

		return brojSlova;
	}

	public static void ispisiNizNaopako(int[] array) {

		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
	}

	public static String najveciZajednickiPrefiks(String s1, String s2) {

		String prefiks = "";

		for (int i = 0; s1.charAt(i) == s2.charAt(i); i++)
			prefiks = prefiks + s1.charAt(i);

		return prefiks;
	}

	public static void baciKartu() {

		int karta = (int) (1 + (Math.random() * 13));
		int znak = (int) (Math.random() * 4);

		System.out.println(odrediKartu(karta) + " " + odrediBoju(znak));
	}

	public static String odrediKartu(int k) {

		String karta;

		if (k == 1)
			karta = "A";
		else if (k == 11)
			karta = "J";
		else if (k == 12)
			karta = "Q";
		else if (k == 13)
			karta = "K";
		else
			karta = "" + k;

		return karta;
	}

	public static String odrediBoju(int b) {

		String boja;

		if (b == 0)
			boja = "Srce";
		else if (b == 1)
			boja = "Mak";
		else if (b == 2)
			boja = "Kocka";
		else
			boja = "List";

		return boja;
	}

	public static double stanjeRacuna(double mis, int bm) {

		double stanje = 0;

		for (int i = 0; i < bm; i++)
			stanje = (mis + stanje) * (1 + 0.00417);

		return stanje;
	}
}
