package src;

import java.util.Scanner;

public class SumaDijagonale {
	public static double sumirajSilaznuDijagonalu(double[][] niz) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i][i];
		}
		return suma;
	}

	public static double sumirajUzlaznuDijagonalu(double[][] niz) {
		double suma = 0;
		for(int i = niz.length -1; i >= 0;) {
			for(int j = 0; j < niz.length;) {
				suma = suma + niz[i][j];
				i--;
				j++;
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrica = new double[4][4];
		System.out.println("Unesite elemente 4x4 matrice red po red: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = input.nextDouble();
			}
		}
		System.out.println("Suma elemenata silazne dijagonale je: " + sumirajSilaznuDijagonalu(matrica));
		System.out.println("Suma elemenata uzlazne dijagonale je: " + sumirajUzlaznuDijagonalu(matrica));
		input.close();

	}

}
