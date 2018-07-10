package src;

import java.util.Scanner;

public class KonverterStopeUMetre {
	public static double stopeUMetre(double stope){ // metoda koja pretvara stope u metre
		double meter = stope * 0.305;
		return meter;
	}

	public static void main(String[] args) {
		// Skener
				Scanner input = new Scanner(System.in);
				//Pozivanje metode
				System.out.println("Unesite broj stopa koje zelite konvertovati: ");
				double foot = input.nextDouble();
				System.out.println(foot + " stopa je " + stopeUMetre(foot) + " metara.");
				//Zatvaranje inputa
				input.close();

	}

}
