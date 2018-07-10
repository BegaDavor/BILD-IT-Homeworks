package src;

import java.util.Scanner;

public class Kombinacije {
	public static void kombinacije(int[] niz) { // metoda koja ispisuje kombinacije i racuna koliko ih ima
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = i; j < niz.length; j++) {
				if (niz[i] != niz[j] && niz[i] < niz[j]) {
					System.out.print(niz[i] + " ");
					System.out.println(niz[j]);
					brojac++;
				}
			}
		}
		System.out.println("Ukupan broj kombinacija je " + brojac + ".");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			niz[i] = input.nextInt();
		}
		System.out.println("Kombinacije unesenih brojeva su: ");
		kombinacije(niz);
		input.close();

	}

}
