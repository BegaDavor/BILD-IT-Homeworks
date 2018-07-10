package src;

import java.util.Scanner;

public class PovratakUProslost {
	//Metoda za racunanje sati, minuta i sekundi
	public static void potrebnoVremenaHMS(long godina) {
		long sati = godina / 3600;
		long minute = (godina % 3600) / 60;
		long sekunde = ((godina % 3600) % 60);
		System.out.println(godina + " godina u proslost cemo otici sa nasim avionom za " + sati + " sati " + minute
				+ " minuta i " + sekunde + " sekundi.");
	}
	//Metoda za racunanje godina, mjeseci i dana
	public static void potrebnoVremenaDMY(long godina) {
		long godina1 = godina / 31104000;
		long mjeseci = (godina % 31104000) / 2592000;
		long dana = ((godina % 31104000) % 2592000) / 86400;
		System.out.println(godina + " godina u proslost cemo otici sa nasim avionom za " + godina1 + " godina "
				+ mjeseci + " mjeseci i " + dana + " dana.");
	}
	//Metoda za racunanje milenija, stoljeca i decenija
	public static void potrebnoVremenaDSM(long godina) {
		long milenija = godina / 31104000000L;
		long stoljeca = (godina % 31104000000L) / 3110400000L;
		long desetljeca = ((godina % 31104000000L) % 3110400000L) / 311040000L;
		System.out.println(godina + " godina u proslost cemo otici sa nasim avionom za " + milenija + " milenija "
				+ stoljeca + " stoljeca i " + desetljeca + " desetljeca.");
	}
	//Metoda za racunanje kilometara, metara i centimetara te koliko bi puta presli stadion i obim Zemlje
	public static void koraci(long godina) {
		long korak = 75 * godina;
		long kilometara = korak / 100000;
		long metara = (korak % 100000) / 100;
		long centimetara = (korak % 100000) % 100;
		long stadion = korak / (10500);
		long zemlja = korak / (4007500000L);
		System.out.println(godina + " godina u proslost cemo otici ako prehodamo " + kilometara + " kilometara "
				+ metara + " metara i " + centimetara + " centimetara.");
		System.out.println("Stadion bi presli " + stadion + " puta, a obim Zemlje " + zemlja + " puta.");
	}

	public static void main(String[] args) {
		//Skener
		Scanner input = new Scanner(System.in);
		//Unos koliko bi godina u proslost isli
		System.out.println("Uneite broj godina koji se zelite vratiti u proslost: ");
		long godina = input.nextLong();
		//Poziv metoda
		potrebnoVremenaHMS(godina);
		potrebnoVremenaDMY(godina);
		potrebnoVremenaDSM(godina);
		koraci(godina);
		//Zatvaranje skenera
		input.close();
	}

}
