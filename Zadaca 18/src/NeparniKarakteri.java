package src;

import java.util.Scanner;

public class NeparniKarakteri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite neki string: "); // unos stringa
		String unos = input.nextLine();
		System.out.println("Uneseni string bez parnih karaktera je: "); //ispis neparnih karaktera
		for (int i = 0; i < unos.length(); i = i + 2) {
			System.out.print(unos.charAt(i));
		}
		input.close(); // skener zatvoren

	}

}
