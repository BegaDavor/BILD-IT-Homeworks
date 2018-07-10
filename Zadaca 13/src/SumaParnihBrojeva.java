package src;

import java.util.Scanner;

public class SumaParnihBrojeva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Skener
		int suma = 0; // inicijaliziranje sume na 0
		System.out.println("Unesite broj: "); 
		int gornjaGranica = input.nextInt(); // unos granicnog broja
		if (gornjaGranica > 0){ // trazimo da broj mora biti veci od 1
		for(int i = 1; i <= gornjaGranica; i++){ // prolazak kroz brojeve od 1 do granicnog broja
			if (i % 2 == 0){ 
				suma = suma + i; // ako je broj paran dodajemo ga na sumu
			}
		}
		System.out.println("Suma parnih brojeva izmedju 1 i " + gornjaGranica + " iznosi: " + suma); // ispis sume
		} else {System.out.println("Broj mora biti veci od 1!");} // poruka ako unesemo broj manji od 1
		
		input.close(); // zatvaramo skener
	}

}
