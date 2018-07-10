package src;

import java.util.Scanner;

public class Voda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite teyinu vode u kilogramima: ");
		double tezinaVode = input.nextDouble();
		System.out.println("Unesite pocetnu temperaturu (u Celzijusima): ");
		double pocetnaTemperatura = input.nextDouble();
		System.out.println("Unesite zeljenu temperaturu (u Celzijusima): ");
		double zeljenaTemperatura = input.nextDouble();
		double energija = tezinaVode*(zeljenaTemperatura-pocetnaTemperatura)*4184;
		System.out.println("Energije potrebno za zagrijavanje vode: " + energija + " Joula");
		input.close();

	}

}
