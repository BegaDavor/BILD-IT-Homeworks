package src;

import java.util.Scanner;

public class Studenti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj studenata: ");
		int brojStudenata = input.nextInt();
		String[] imeStudenta = new String[brojStudenata];
		int[] ocjena = new int[brojStudenata];
		for (int i = 0; i < brojStudenata; i++) {
			System.out.println("Unesite ime " + (i + 1) + ". studenta: ");
			imeStudenta[i] = input.next();
		}
		for (int j = 0; j < brojStudenata; j++) {
			System.out.println("Unesite ocjenu (od 6 do 10) za studenta " + imeStudenta[j] + ": ");
			ocjena[j] = input.nextInt();
			while (ocjena[j] < 6 || ocjena[j] > 10) {
				System.out.println("Unos nije dobar, probajte ponovo: ");
				ocjena[j] = input.nextInt();
			}
		}
		System.out.println("Studenti poredani po uspjehu su: ");
		for (int l = 10; l >= 6; l--) {
		for (int k = 0; k < brojStudenata; k++) {
			
				if (ocjena[k] == l) {
					System.out.println(imeStudenta[k]);
				} 
			}
		}
		input.close();

	}

}
