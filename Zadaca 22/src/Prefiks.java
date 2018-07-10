package src;

import java.util.Scanner;

public class Prefiks {
	public static void prefiks(String str1, String str2) { // metoda koja prepoynaje prefikse
		String prefiks = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (i == j) {
					if (str1.charAt(i) == str2.charAt(j)) {
						prefiks = prefiks + str1.charAt(i);
					} else if (str1.charAt(i) != str2.charAt(j)) {
						if (prefiks != "") {
							System.out.println("Zajednici prefiks za dva stringa je: " + prefiks);
							return;
						} else {
							System.out.println("Stringovi " + str1 + " i " + str2 + " nemaju zajednicki prefiks.");
							return;
						}
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite prvi string: "); // unos stringova
		String str1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String str2 = input.nextLine();
		prefiks(str1, str2); // poziv metode
		input.close(); // zatvaramo skener

	}

}
