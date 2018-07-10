package src;

import java.util.Scanner;

public class DjeljiviSaTri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int suma = 0;
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
			if (niz[i] > 0 && niz[i] % 3 == 0) {
				suma = suma + niz[i];
			}
		}
		System.out.println("Suma pozitivnih clanova niza djeljivih sa je: " + suma);
		input.close();
	}

}
