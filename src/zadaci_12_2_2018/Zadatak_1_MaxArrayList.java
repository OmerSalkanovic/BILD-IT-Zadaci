package zadaci_12_2_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_MaxArrayList {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {

		Scanner unos = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		int number = 0;

		do {

			System.out.print("Unesi broj(nula prekida unos): ");
			number = unos.nextInt();
			if (number != 0)
				list.add(number);

		} while (number != 0);

		if (max(list) == null)
			System.out.println("Lista je prazna");
		else
			System.out.println("Maksimum liste je " + max(list));

		unos.close();
	}

	public static Integer max(ArrayList<Integer> list) {

		if (list.isEmpty())
			return null;

		else {

			int max = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > max)
					max = list.get(i);
			}

			return max;
		}

	}
}
