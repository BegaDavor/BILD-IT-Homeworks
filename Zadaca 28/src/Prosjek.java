package src;

import java.util.Scanner;

public class Prosjek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] brojevi = new double[100];
		double broj = 0;
		double suma = 0;
		int i = 0;
		int brojac = 0;
		int brojacIspod = 0;
		int brojacIznad = 0;
		int brojacJednako = 0;
		final double EPSILON = 1E-14;
		System.out.println("Unesite neke brojeve (najvise 100 i negativan broj prekida unos): ");
		do {
				brojevi[i] = input.nextInt();
				broj = brojevi[i];
				if (broj >= 0) {
				suma = suma + brojevi[i];
				brojac++;
				}
				i++;
			}while (broj >= 0);
		double prosjek = suma / (double) brojac;
		System.out.println(prosjek);
		for (int j = 0; j < brojac; j++) {
			if (Math.abs((brojevi[j] - prosjek)) < EPSILON) {
				brojacJednako++;
			} else if ((brojevi[j] - prosjek) < 0.0) {
				brojacIspod++;
			} else if ((brojevi[j] - prosjek) > 0.0) {
				brojacIznad++;
			}
		}
		System.out.println("Broj unesenih rezultata koji su jednaki prosjeku je: " + brojacJednako);
		System.out.println("Broj unesenih rezultata koji su iznad prosjeka je: " + brojacIznad);
		System.out.println("Broj unesenih rezultata koji su ispod prosjeka je: " + brojacIspod);
		input.close();
	}

}
