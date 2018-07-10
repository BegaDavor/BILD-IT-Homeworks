package src;

import java.util.Scanner;

public class NajmanjiNeparni {
	public static int najmanjiNeparniClanNiz(int[] niz) {
		int najmanji = niz[0];
		for (int i = 0; i < niz.length; i = i + 2) {
			if (niz[i] <= najmanji) {
				najmanji = niz[i];
			}
		}
		return najmanji;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
		}
		System.out.println("Najmanji element na neparnoj poziciji niza je: " + najmanjiNeparniClanNiz(niz));
		input.close();
	}

}
