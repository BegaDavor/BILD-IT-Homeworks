package src;

import java.util.Scanner;

public class Recenica {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite recenicu: "); // unos stringa
		String recenica = input.nextLine();
		char rijec;
		int razmak = 0; // brojac razmaka
		for (int i = 0; i < recenica.length(); i++){ // petlja koja prolazi kroz string
	
		if (Character.isLetter(recenica.charAt(i))){ // ako je slovo ubacuje ispisuje ga 
			rijec = recenica.charAt(i);
			System.out.print(rijec);
			razmak = 0;
		}else { // ako nije onda resetujemo rijec 
			rijec = ' ';
			if (razmak == 0){ // ako smo imali neku rijec prebacuje u novi red, ako nije bilo uopste slova onda samo resetuje rijec
			System.out.println();
			razmak++;
			}
		}
				
		}
		
		input.close(); // zatvaramo skener

	}

}
