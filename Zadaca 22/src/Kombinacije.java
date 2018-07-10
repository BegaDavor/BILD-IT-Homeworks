package src;

import java.util.Scanner;

public class Kombinacije {
	public static void kombinacije(int broj1, int broj2) { // metoda koja ispisuje kombinacije i racuna koliko ih ima
		int brojac = 0;
		for (int i = broj1; i <= broj2; i++) {
			for (int j = i; j <= broj2; j++) {
				if (i != j && i < j) {
					System.out.print(i + " ");
					System.out.println(j);
					brojac++;
				}
			}
		}
		System.out.println("Ukupan broj kombinacija je " + brojac + ".");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite pocetni broj: "); // unos pocetnog broja npr. 1
		int broj1 = input.nextInt();
		System.out.println("Unesite krajnji broj: "); // unos krajnjeg broja npr. 7
		int broj2 = input.nextInt();
		if (broj2 > broj1) { // pozivi metode
		kombinacije(broj1, broj2);
		} else if (broj1 > broj2) {
			kombinacije(broj2, broj1);
		} else {
			System.out.println("Nema kombinacija.");
		}
		input.close(); // zatvaramo skener

	}

}
