package src;

import java.util.Scanner;

public class SusjedniClanovi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			if ((niz[i] + niz[i + 1]) % 2 == 0) {
				System.out.println(niz[i] + " i " + niz[i + 1]);
			}
		}

		input.close();
	}

}
