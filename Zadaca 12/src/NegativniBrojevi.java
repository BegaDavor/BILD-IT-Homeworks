package src;

import java.util.Scanner;

public class NegativniBrojevi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Skener
		double zbir = 0; 
		double counter = 0;
		int counterPozitivnih = 0;
		int counterNegativnih = 0;
		int broj = -1; // Inicijaliziramo zbir i countere na 0, a broj na bilo koji broj reazlicit od 0
		System.out.println("Unesite cijeli broj (0 prekida unos): ");
		while (broj != 0){
			broj = input.nextInt(); // unos broja
			zbir = zbir + broj; // zbir povecavamo za broj
			if (broj != 0){
				counter++; // brojac povecavamo za 1
				if (broj > 0){
					counterPozitivnih++;
				}else if (broj < 0){
					counterNegativnih++;
				}
			}
						
		}
		double prosjek = zbir / counter; // izracunavanje prosjeka
		if (counter != 0){ 				// ako ne unesemo samo 0, ispisujemo zbir, prosjek, koliko je bilo negativnih, a koliko pozitivnih brojeva
		System.out.println("Broj unesenih pozitivnih brojeva je: " + counterPozitivnih);
		System.out.println("Broj svih negativnih brojeva je: " + counterNegativnih);
		System.out.println("Zbir unesenih brojeva iznosi: " + zbir);
		System.out.println("Prosjek unesenih brojeva iznosi: " + prosjek);
		}else {
			System.out.println("Unijeli ste samo 0."); // ako unesemo samo 0, ispisuje da smo unijeli samo 0
		}
		input.close(); // zatvaramo skener
	}

}
