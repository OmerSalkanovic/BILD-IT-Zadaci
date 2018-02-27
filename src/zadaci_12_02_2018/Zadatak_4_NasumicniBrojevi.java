package zadaci_12_02_2018;

public class Zadatak_4_NasumicniBrojevi {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		int[] numbers = new int[10];

		int endl = 0;
		for (int i = 0; i < 100; i++) {

			if (endl % 10 == 0 && endl != 0)
				System.out.println();
			int number = (int) (Math.random() * 10);
			System.out.print(number + " ");
			numbers[number]++;
			endl++;
		}
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Broj " + i + " se pojavljuje " + numbers[i] + " puta");
		}
	}
}
