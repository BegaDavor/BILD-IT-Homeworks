package src;

import java.util.Scanner;

public class FaktoriBrojeva {
	public static boolean jeFaktor(int broj, int faktor) {// metoda koja ispituje da li je odredjeni broj faktor nekog drugog broja
		boolean jeFaktor = false;
		if (broj % faktor == 0) {
			jeFaktor = true;
		}else {
			jeFaktor = false;
		}
		return jeFaktor;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //skener
		System.out.println("Unesite broj:"); // unos broja kojem trazimo faktore
		int broj = input.nextInt();
		System.out.println("Faktori broja " + broj + " su:");
		for (int i = 1; i <= broj; i++) { // prolazimo kroz brojeve od 1 do unesenog broja i ispisujemo faktore
			if (jeFaktor(broj, i) == true) {
				System.out.print(i + " ");
			}
		}
		input.close(); //zatvaramo skener

	}

}
