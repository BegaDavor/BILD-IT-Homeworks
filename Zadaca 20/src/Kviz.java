package src;

import java.util.Scanner;

public class Kviz {
	public static void pitanja(int brojPitanja) {
		Scanner input = new Scanner(System.in);
		int brojacTacnihOdgovora = 0;
		for (int i = 1; i <= brojPitanja; i++) {
			int broj1 = (int) (Math.random() * 10);
			int broj2 = (int) (Math.random() * 10);
			int tacanOdgovor = broj1 - broj2;
			System.out.println("Koliko je " + broj1 + " - " + broj2 + ": ");
			int odgovor = input.nextInt();
			if (odgovor == tacanOdgovor) {
				brojacTacnihOdgovora++;
			}
		}
		input.close();
		System.out.println("Broj tacnih odgovora je: " + brojacTacnihOdgovora);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja: ");
		int brojPitanja = input.nextInt();
		pitanja(brojPitanja);
		input.close();

	}
}
