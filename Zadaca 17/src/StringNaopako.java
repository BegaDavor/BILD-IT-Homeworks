package src;

import java.util.Scanner;

public class StringNaopako {
	public static void stringNaopako(String noviString) {//metoda koja ispisuje odredjeni string naopako
		for (int i = noviString.length()-1; i >= 0; i--) {
			System.out.print(noviString.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite neki string: "); // unos stringa
		String noviString = input.nextLine();
		System.out.println("Uneseni string naopako je: ");// ispisujemo uneseni string naopako
		stringNaopako(noviString);
		input.close(); // zatvaramo skener

	}

}
