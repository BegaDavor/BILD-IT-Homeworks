package src;

import java.util.Scanner;

public class SlovaNaTelefonu {
	public static int slovoNaTelefonu(char slovo) { // metoda koja odredjenom slovu dodjeljuje odgovarajuci broj
		int broj = 0;
		if (Character.isLetter(slovo) == true) {
			if (slovo == 'A' || slovo == 'a' || slovo == 'B' || slovo == 'b' || slovo == 'C' || slovo == 'c') {
				broj = 2;
			} else if (slovo == 'D' || slovo == 'd' || slovo == 'E' || slovo == 'e' || slovo == 'F' || slovo == 'f') {
				broj = 3;
			} else if (slovo == 'G' || slovo == 'g' || slovo == 'H' || slovo == 'h' || slovo == 'I' || slovo == 'i') {
				broj = 4;
			} else if (slovo == 'J' || slovo == 'j' || slovo == 'K' || slovo == 'k' || slovo == 'L' || slovo == 'l') {
				broj = 5;
			} else if (slovo == 'M' || slovo == 'm' || slovo == 'N' || slovo == 'n' || slovo == 'O' || slovo == 'o') {
				broj = 6;
			} else if (slovo == 'P' || slovo == 'p' || slovo == 'Q' || slovo == 'q' || slovo == 'R' || slovo == 'r'
					|| slovo == 'S' || slovo == 's') {
				broj = 7;
			} else if (slovo == 'T' || slovo == 't' || slovo == 'U' || slovo == 'u' || slovo == 'V' || slovo == 'v') {
				broj = 8;
			} else if (slovo == 'W' || slovo == 'w' || slovo == 'X' || slovo == 'x' || slovo == 'Y' || slovo == 'y'
					|| slovo == 'Z' || slovo == 'z') {
				broj = 9;
			}
		} else {
			broj = 0;
		}
		return broj;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		char ch = ' ';
		System.out.println("Unesite neki karakter: "); // unos karaktera
		String karakter = input.next();
		input.close(); // zatvaramo skener
		if (karakter.length() < 2) {
			ch = karakter.charAt(0);
		} else {
			System.out.println("Morate unijeti samo jedan karakter!");
			return;
		}
		if (slovoNaTelefonu(ch) != 0) {
			System.out.println("Odgovarajuci broj je: " + slovoNaTelefonu(ch)); // poziv metode
		} else {
			System.out.println(ch + " predstavlja pogresan unos."); // poruka koja se ispisuje ako unesemo bilo sta osim slova
		}

	}

}
