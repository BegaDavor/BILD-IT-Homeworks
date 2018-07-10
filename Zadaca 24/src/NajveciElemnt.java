package src;

import java.util.Scanner;

public class NajveciElemnt {
	public static int max(int[] array) {
		int max = Math.abs(array[0]);
		int outputMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (Math.abs(array[i]) > max) {
				max = Math.abs(array[i]);
				outputMax = array[i];
			}
		}
		return outputMax;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = input.nextInt();
		int[] niz = new int[duzinaNiza];
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
		}
		System.out.println("Najveci element po apsolutnoj vrijednosti je: " + max(niz));
		input.close();

	}

}
