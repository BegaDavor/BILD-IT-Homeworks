package src;

import java.util.Scanner;

public class ZbriCifara {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Skener
		int zbir = 0;
		int ostatak = 1; //inicijalizacija zbira i ostatka ali ostatak % 10 != 0
		System.out.println("Unesite pozitivan broj: "); // trazimo da se unese broj
		int broj = input.nextInt();
		while (broj < 0){ // trazimo da se unes broj dok ne bude pozitivan
				System.out.println("Unesite pozitivan broj: ");
				broj = input.nextInt();
				}
		do{	 
				if (broj >= 0){ // kada je pozitivan
			ostatak = broj % 10; // ostatak postaje posljednja cifra
			zbir = zbir + ostatak; // ovdje sabiramo cifre 
			broj = broj / 10; // a broju odbijamo posljednu cifru
			}	
				
		}while (broj != 0); // vrtimo sve dok broj ne postane 0
		System.out.println("Zbir cifara je: " + zbir); // ispisujemo zbir cifara
		input.close(); // zatvaramo skener
	}	
	}
		

	


