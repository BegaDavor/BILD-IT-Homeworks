package src;

import java.util.Scanner;

public class ZbirIProsjek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Skener
		double zbir = 0; 
		double counter = 0;
		int broj = -1; // Inicijaliziramo zbir i counter na 0, a broj na bilo koji broj reazlicit od 0
		System.out.println("Unesite cijeli broj (0 prekida unos): ");
		while (broj != 0){
			broj = input.nextInt(); // unos broja
			zbir = zbir + broj; // zbir povecavamo za broj
			if (broj != 0){
				counter++; // brojac povecavamo za 1
			}
						
		}
		double prosjek = zbir / counter; // izracunavanje prosjeka
		if (counter != 0){ 													// ako ne unesemo samo 0, ispisujemo zbir i prosjek
		System.out.println("Zbir unesenih brojeva iznosi: " + zbir);
		System.out.println("Prosjek unesenih brojeva iznosi: " + prosjek);
		}else {
			System.out.println("Unijeli ste samo 0."); // ako unesemo samo 0, ispisuje da smo unijeli samo 0
		}
		input.close(); // zatvaramo skener
		} 
		

	}


