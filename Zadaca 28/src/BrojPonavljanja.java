package src;

import java.util.Scanner;

public class BrojPonavljanja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] brojevi = new int[1000];
		int broj = -1;
		int i = 0;
		System.out.println("Unesite brojeve izmedju 1 i 100 (0 prekida unos): ");
		while (broj != 0) {
			broj = input.nextInt();
			if (broj >= 1 && broj <= 100) {
				brojevi[i] = broj;
				i++;
			} else if (broj < 1 && broj > 100) {
				System.out.println("Broj mora biti izmedju 1 i 100. Pokusajte ponovo: ");
				broj = input.nextInt();
			} else if (broj == 0) {

			}
		}
		int counter = 0;
		for (int j = 1; j <= 100; j++) {
			for (int k = 0; k < brojevi.length; k++) {
				if (brojevi[k] == j) {
					counter++;
				}
			}
				if (counter == 1) {
					System.out.println("Broj " + j + " se pojavljuje 1 put.");
				} else if (counter > 1) {
					System.out.println("Broj " + j + " se pojavljuje " + counter + " puta.");
				} 
				counter = 0;

			}
		input.close();

		}

	}


