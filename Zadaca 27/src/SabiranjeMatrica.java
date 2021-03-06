package src;

import java.util.Scanner;

public class SabiranjeMatrica {
	public static double[][] saberiMatrice(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Matrice moraju biti formata 3 x 3! ");
		System.out.println("Unesite prvu matricu: ");
		double[][] a = new double[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		System.out.println("Unesite drugu matricu: ");
		double[][] b = new double[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = input.nextDouble();
			}
		}
		double[][] c = saberiMatrice(a, b);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
