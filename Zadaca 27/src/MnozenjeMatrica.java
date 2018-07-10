package src;

import java.util.Scanner;

public class MnozenjeMatrica {
	public static double[][] pomnoziMatrice(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
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
		double[][] c = pomnoziMatrice(a, b);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

	}

}
