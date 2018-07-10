package src;

import java.util.Scanner;

public class Novcici {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite iznos: "); // unos iznosa
		int iznos = input.nextInt();
		int broj1 = 0; // brojac 1KM
		int broj3 = 0; // brojac 3KM
		int broj5 = 0; // brojac 5KM
		while (iznos != 0){
		if (iznos >= 5){
			broj5 = iznos / 5;
			iznos = iznos - (broj5 * 5);
		}else if (iznos >= 3){
			broj3 = iznos / 3;
			iznos = iznos - (broj3 * 3);
		}else if (iznos >= 1){
			broj1 = iznos;
			iznos = iznos - iznos;
		}
	}
		int brojNovcanica = broj5 + broj3 + broj1;
		System.out.println("Broj novcanica potreban za ispatu iznosa je: " + brojNovcanica);
		input.close();
	}

}
