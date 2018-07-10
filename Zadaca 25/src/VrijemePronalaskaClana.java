package src;

import java.util.Scanner;

public class VrijemePronalaskaClana {
	public static int[] generisanjeNiza(int brojClanova) {
		int[] niz = new int[brojClanova];
		for (int i = 0; i < brojClanova; i++) {
			niz[i] = (int) (Math.random() * 100000);
		}
		return niz;
	}

	public static int[] sortiranje(int[] niz) {
		int kontejner;
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++)
				if (niz[i] > niz[j]) {
					kontejner = niz[i];
					niz[i] = niz[j];
					niz[j] = kontejner;

				}
		}
		return niz;
	}

	public static int linearnoPretrazivanje(int[] niz, int element) {
		int trazeniElement = 0;
		for (int i = 0; i < niz.length; i++) {
			if (element == niz[i]) {
				trazeniElement = niz[i];
			}
		}
		return trazeniElement;
	}

	public static int binarnoPretrazivanje(int[] niz, int element) {
		sortiranje(niz);
		int desni, granica, sredina;
		desni = 0;
		granica = niz.length - 1;

		while (desni <= granica) {
			sredina = (desni + granica) / 2;
			if (niz[sredina] == element)
				return (sredina);
			if (niz[sredina] < element) {
				desni = sredina + 1;
			} else {
				granica = sredina - 1;
			}
		}
		return (-1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Koju vrijednost zelite naci u nizu: ");
		int clanNiza = input.nextInt();
		int[] niz = generisanjeNiza(100000);
		System.out.println("Unesite kojom metodom zelite da program pronadje trazenu vrijednost (0 - linearna metoda, 1 - binarna metoda): ");
		int metoda = input.nextInt();
		if (metoda == 0) {
			long pocetakMjerenja = System.currentTimeMillis();
			linearnoPretrazivanje(niz, clanNiza);
			long krajMjerenja = System.currentTimeMillis();
			long ukupnoVrijeme = krajMjerenja - pocetakMjerenja;
			System.out.println("Vrijeme potrebno za pronalazenje unesenog elementa je: " + ukupnoVrijeme + " ms.");
		}else if (metoda == 1) {
			long pocetakMjerenja = System.currentTimeMillis();
			binarnoPretrazivanje(niz, clanNiza);
			long krajMjerenja = System.currentTimeMillis();
			long ukupnoVrijeme = krajMjerenja - pocetakMjerenja;
			System.out.println("Vrijeme potrebno za pronalazenje unesenog elementa je: " + ukupnoVrijeme + " ms.");
		}
		input.close();

	}

}
