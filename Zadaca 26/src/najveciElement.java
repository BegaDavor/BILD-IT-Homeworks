package src;

import java.util.Scanner;

public class najveciElement {
	public static int[] najveciElement(double[][] niz) {
		int[] redniBroj = new int[2];
		double max = 0.0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz[i][j] >= max) {
					max = niz[i][j];
					redniBroj[0] = i;
					redniBroj[1] = j;
				}
			}
		}
		return redniBroj;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i kolona matrice: ");
		int brojRedova = input.nextInt();
		int brojKolona = input.nextInt();
		double[][] matrica = new double[brojRedova][brojKolona];
		System.out.println("Unesite " + brojRedova + " x " + brojKolona + " matricu: ");
		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				matrica[i][j] = input.nextDouble();
			}
		}
		int[] redniBroj = new int[2];
		redniBroj = najveciElement(matrica);
		System.out.println("Lokacija najveceg elementa je: (" + redniBroj[0] + ", " + redniBroj[1] + ")");
		input.close();

	}

}
