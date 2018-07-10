package src;

import java.util.Scanner;

public class KonverterSotpeMetri {
	//Metoda za pretvaranje
	public static double footToMeter(double foot){
		double meter = foot * 0.305;
		return meter;
	}

	public static void main(String[] args) {
		// Skener
		Scanner input = new Scanner(System.in);
		//Pozivanje metode
		System.out.println("Unesite broj stopa koje zelite konvertovati: ");
		double foot = input.nextDouble();
		System.out.println(foot + " stopa je " + footToMeter(foot) + " metara.");
		//Zatvaranje inputa
		input.close();
		
	

	}

}
