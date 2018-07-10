package src;

import java.util.Scanner;

public class SumaParnihNeparnih {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sumaParnih = 0;
		int sumaNeparnih = 0;
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
		}
		for (int j = 0; j < 10; j++) {
			if (niz[j] % 2 == 0) {
				sumaParnih = sumaParnih + niz[j];
			} else if (niz[j] % 2 != 0) {
				sumaNeparnih = sumaNeparnih + niz[j];
			}
		}
		System.out.println("Suma parnih elemenata niza je: " + sumaParnih);
		System.out.println("Suma neparnih elemenata niza je: " + sumaNeparnih);
		input.close();

	}

}
