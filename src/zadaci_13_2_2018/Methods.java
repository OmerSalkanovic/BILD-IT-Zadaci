package zadaci_13_2_2018;

public class Methods {

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;

		return true;
	}

	public static void printPrimeNumbers(int number_1, int number_2, int endl) {

		int endLine = 0;

		for (int i = number_1; i <= number_2; i++) {

			if (isPrime(i)) {

				System.out.print(i + " ");

				if (endLine != 0 && endLine % endl == 0)
					System.out.println();

				endLine++;

			}
		}
	}

	public static double min(double[] array) {

		double min = array[0];

		for (int i = 0; i < array.length; i++)
			if (array[i] < min)
				min = array[i];

		return min;
	}

	public static boolean equals(int[] niz1, int[] niz2) {

		if (niz1.length == niz2.length) {

			for (int i = 0; i < niz1.length; i++)
				if (niz1[i] != niz2[i])
					return false;

			return true;
		} else
			return false;
	}

	public static int[] locateLargest(double[][] a) {

		int[] location = new int[2];

		location[0] = 0;
		location[1] = 0;

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				if (a[location[0]][location[1]] < a[i][j]) {
					location[0] = i;
					location[1] = j;
				}

		return location;
	}

	public static double[][] sortRows(double[][] array) {

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length - 1; j++)
				for (int k = j + 1; k < array[i].length; k++)
					if (array[i][j] > array[i][k]) {
						double t = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = t;
					}

		return array;
	}

	public static void print2DArray(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}
