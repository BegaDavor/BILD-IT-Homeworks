package src;

import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = input.nextInt();
		int[] niz = new int[duzinaNiza];
		int sumaClanova = 0;
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
			sumaClanova = sumaClanova + niz[i];
		}
		double aritmetickaSredina = (double) (sumaClanova) / (double) (duzinaNiza);
		System.out.println("Aritmeticka sredina clanova niza je: " + aritmetickaSredina);
		input.close();
	}

}
