package src;

import java.util.Scanner;

public class BubbleSort {
	public static double[] bubbleSort(double[] niz) {
		boolean prebacen = true;
		int i = 0;
		double kontejner;
		while (prebacen) {
			prebacen = false;
			i++;
			for (int j = 0; j < niz.length - i; j++) {
				if (niz[j] > niz[j + 1]) {
					kontejner = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = kontejner;
					prebacen = true;
				}
			}
		}
		return niz;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] niz = new double[10];
		System.out.println("Unesite 10 brojeva u niz: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextDouble();
		}
		bubbleSort(niz);
		System.out.println("Sortiran uneseni niz je: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		input.close();

	}

}
