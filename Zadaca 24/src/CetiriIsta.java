package src;

import java.util.Scanner;

public class CetiriIsta {
	public static boolean cetiriIsta(int[] niz) {
		boolean uslov = false;
		for (int i = 0; i < niz.length - 3; i++) {
			if (niz[i] == niz[i + 1] && niz[i] == niz[i + 2] && niz[i] == niz[i + 3]) {
				uslov = true;
				break;
			} else {
				uslov = false;
			}
		}
		return uslov;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = input.nextInt();
		int[] niz = new int [duzinaNiza];
		System.out.println("Unesite " + duzinaNiza + " elemenata: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}
		if (cetiriIsta(niz) == true) {
			System.out.println("Ovaj niz sadrzi 4 ista broja uzastopno.");
		}else {
			System.out.println("Ovaj niz ne sadrzi 4 ista broja uzastopno.");
		}
		input.close();

	}

}
