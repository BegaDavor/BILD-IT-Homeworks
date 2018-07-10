package src;

import java.util.Scanner;

public class JedinstveniBrojevi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite deset brojeva: ");
		int[] niz = new int[10];
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			int broj = input.nextInt();
			boolean jedinstven = true;
			for (int j = 0; j < brojac; j++) {
				if (broj == niz[j]) {
					jedinstven = false;
					break;
				}
			}

			if (jedinstven) {
				niz[brojac++] = broj;
			}
		}
		System.out.println("Broj jedinstvenih brojeva je: " + brojac);
		System.out.print("Jedinstveni brojevi su: ");
		for (int i = 0; i < brojac; i++) {
			System.out.print(niz[i] + " ");

		}
		input.close();

	}
}
