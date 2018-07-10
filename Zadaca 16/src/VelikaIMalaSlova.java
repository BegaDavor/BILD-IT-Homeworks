package src;

import java.util.Scanner;

public class VelikaIMalaSlova {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //skener
		int brojacMalihSlova = 0;
		int brojacVelikihSlova = 0;
		System.out.println("Unesite neki string: "); // unos stringa
		String recenica = input.nextLine();
		for (int i = 0; i < recenica.length(); i++ ){ // prolazak kroz karaktere
			if (Character.isLowerCase(recenica.charAt(i))){ // ako je malo slovo brojac malih slova povecavamo za 1
				brojacMalihSlova = brojacMalihSlova + 1;
			}else if (Character.isUpperCase(recenica.charAt(i))){ // ako je veliko brojac velikih povecavamo za 1
				brojacVelikihSlova = brojacVelikihSlova + 1;
			}
		}
		double procenatMalihSlova = (double)((double) brojacMalihSlova/((double)brojacMalihSlova+(double)brojacVelikihSlova))*100; // izracunavanje procenta malih slova
		double procenatVelikihSlova =  ((double)brojacVelikihSlova/((double)brojacMalihSlova+(double)brojacVelikihSlova))*100; // izracunavanje procenta velikih slova
		System.out.println("Postotak malih slova u stringu je " + procenatMalihSlova+ "%" + ", a velikih " + procenatVelikihSlova + "%.");
		input.close(); // zatvaramo skener
	}

}
