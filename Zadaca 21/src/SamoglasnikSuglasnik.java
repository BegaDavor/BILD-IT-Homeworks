package src;

import java.util.Scanner;

public class SamoglasnikSuglasnik {
	public static boolean jeSamoglasnik(char slovo) { // metoda koja prepoznaje sta je samoglasnik
		boolean samoglasnik = false;
		if (slovo == 'A' || slovo == 'E' || slovo == 'I' || slovo == 'O' || slovo == 'U' || slovo == 'a' || slovo == 'e'
				|| slovo == 'i' || slovo == 'o' || slovo == 'u') {
			samoglasnik = true;
		} else {
			samoglasnik = false;
		}
		return samoglasnik;
	}

	public static void staJeOvo(char karakter) { // metoda koja odredjuje da li je uneseni karakter samoglasnik,
													// suglasnik ili nesto drugo
		if (Character.isLetter(karakter)) {
			if (jeSamoglasnik(karakter) == true) {
				System.out.println(karakter + " je samoglasnik.");
			} else {
				System.out.println(karakter + " je suglasnik.");
			}
		} else {
			System.out.println(karakter + " predstavlja pogresan unos.");
		}
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
		staJeOvo(ch); // poziv metode staJeOvo

	}

}
