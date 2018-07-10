package src;

import java.util.Scanner;

public class PutovanjeKrozSvemir {
	//Metoda za broj kilometara
	public static void kilometri(long svjetlosneGodine) {
		final double brzinaSvjetlosti = 299792458;
		double predjeniPut = brzinaSvjetlosti * (0.001/(1.0/31536000)) * (double) svjetlosneGodine;
		System.out.println("Broj kilometara koji svjetlost predje za " + svjetlosneGodine + " godina je " + predjeniPut);
	}
	public static void astronomskeJedinice(long svjetlosneGodine) {
		final double brzinaSvjetlosti = 299792458;
		double predjeniPutKm = brzinaSvjetlosti * (0.001/(1.0/31536000)) * (double) svjetlosneGodine;
		double predjeniPutAU = predjeniPutKm / (149.6 * 1000000);
		System.out.println("Broj AU koji svjetlost predje za " + svjetlosneGodine + " godina je " + predjeniPutAU);
	}
	public static void parsec(long svjetlosneGodine) {
		double parsec = (double) svjetlosneGodine / (3.26);
		System.out.println("Broj Parsec-a koji svjetlost predje za " + svjetlosneGodine + " godina je " + parsec);
	}
	public static void helios(double predjeniPut) {
		double vrijeme = (predjeniPut/(252792.537))*(1.0/8760.0);
		System.out.println("Broj godina koje nama treba da predjemo istu razdaljinu sa Helios 2 objectom je: " + vrijeme + " godina.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double brzinaSvjetlosti = 10799252848.8;
		System.out.println("Unesite broj svjetlosnih godina: ");
		long svjetlosneGodine = input.nextLong();
		kilometri(svjetlosneGodine);
		astronomskeJedinice(svjetlosneGodine);
		parsec(svjetlosneGodine);
		double predjeniPut = brzinaSvjetlosti * (0.001/(1.0/31536000)) * (double) svjetlosneGodine;
		helios(predjeniPut);
		input.close();
	}

}
