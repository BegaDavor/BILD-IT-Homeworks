package src;

import java.util.Scanner;

public class StedniRacun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Skener
		double krajnjiIznos = 0; // inicijaliziramo krajnji iznos
		double mjesecnaKamata = 0.05/12.0; // mjesecna kamata
		System.out.println("Unesite mjesecni iznos stednje: "); // trazimo unos uplacenog iznosa i broj mjeseci na koji cemo primati kamatu
		double mjesecniIznos = input.nextDouble();
		System.out.println("Upisite broj mjeseci nakon kojeg bi zeljeli znati stanje na racunu: "); 
		int brojMjeseci = input.nextInt();
		for (int i = 1; i <= brojMjeseci; i++){ // izracunavamo krajnji iznos
			krajnjiIznos = (mjesecniIznos + krajnjiIznos)*(1 + mjesecnaKamata);
		}
		System.out.println("Iznos na racunu nakon " + brojMjeseci + " mjeseci ce biti: " + krajnjiIznos); // ispis krajnjeg iznosa nakon unesenog broja mjeseci
		input.close(); // zatvaramo skener

	}

}
