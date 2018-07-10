package src;

import java.util.Scanner;

public class BrojSamoglasnika { // metoda koja ispituje da li je karakter samoglasnik
	public static boolean jeSamoglasnik(char slovo) {
		boolean samoglasnik = false;
		if (slovo == 'A' || slovo == 'E' || slovo == 'I' || slovo == 'O' || slovo == 'U' || slovo == 'a' || slovo == 'e' || slovo == 'i' || slovo == 'o' || slovo == 'u') {
			samoglasnik = true;
		} else {samoglasnik = false;}
		return samoglasnik;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite neki string: "); // unos stringa
		String unos = input.nextLine();
		int brojac = 0; // brojac samoglasnika
		for (int i = 0; i < unos.length(); i++) { // prolaz kroz karaktere stringa
			if (jeSamoglasnik(unos.charAt(i)) == true) { // ako jeste samoglasnik povecava brojac za 1
				brojac++;
			}
		}
		System.out.println("Samoglasnika u unesenom stringu ima: " + brojac); // ispis broja samoglasnika
		input.close(); // skener zatvoren

	}

}
