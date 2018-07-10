package src;

import java.util.Scanner;

public class SumaElemenateKolone {
	public static double sumirajKolonu(double[][] niz, int kolona) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i][kolona];
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrica = new double[3][4];
		System.out.println("Unesite elemente 3x4 matrice red po red: ");
		for (int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = input.nextDouble();
			}
		}
		for (int k = 0; k < 4; k++) {
			System.out.println("Zbir svih elemenata u koloni " + k + "je: " + sumirajKolonu(matrica, k));
		}
		input.close();

	}

}
