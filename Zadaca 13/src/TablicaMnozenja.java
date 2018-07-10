package src;

import java.util.Scanner;

public class TablicaMnozenja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite broj: "); // trazimo da korisnik unese broj
		int broj = input.nextInt();
		System.out.println("Tablica mnozenja za broj " + broj + " je:");
		for (int i = 1; i <= 10; i++){ // ptelja koja izracunava rezultate mnozenja
			int rezultat = i * broj;			
			System.out.println(broj + " * " + i + " = " + rezultat); // ispis tablice
		}
		input.close(); // zatvaramo skener

	}

}
