package src;

import java.util.Scanner;

public class ObrnutRedoslijedBrojeva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] niz = new int[10];
		System.out.println("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}
		System.out.println("Uneseni brojevi u obrnutom redoslijedu su: ");
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
		input.close();

	}

}
