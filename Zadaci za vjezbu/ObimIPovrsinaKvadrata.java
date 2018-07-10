package src;

import java.util.Scanner;
//metode
public class ObimIPovrsinaKvadrata {
	public static double obim(double stranica){
		return 4.0*stranica; 
	}
	public static double povrsina(double stranica){
		return stranica*stranica; 
	}

	public static void main(String[] args) {
		// Skener
		Scanner input = new Scanner(System.in);
		// unos stranice
		System.out.println("Unesite duzinu stranice: ");
		double stranica = input.nextDouble();
		// ispis obima i povrsine
		System.out.println("Kvadrat stranice " + stranica + " ima obim " + obim(stranica) + ", a povrsinu " + povrsina(stranica) + ".");
		input.close(); // zatvaranje skenera

	}

}
