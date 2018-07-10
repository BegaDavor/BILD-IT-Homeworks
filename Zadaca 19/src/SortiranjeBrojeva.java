package src;

import java.util.Scanner;

public class SortiranjeBrojeva {
	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3){ // metoda koja sortira brojeve
		if (broj1 < broj2 && broj2 < broj3){
			System.out.println("Sortirani brojevi su: " + broj1 + " " + broj2 + " " + broj3);
		}else if (broj1 < broj3 && broj3 < broj2){
			System.out.println("Sortirani brojevi su: " + broj1 + " " + broj3 + " " + broj2);
		}else if (broj2 < broj1 && broj1 < broj3){
			System.out.println("Sortirani brojevi su: " + broj2 + " " + broj1 + " " + broj3);
		}else if (broj2 < broj3 && broj3 < broj1){
			System.out.println("Sortirani brojevi su: " + broj2 + " " + broj3 + " " + broj1);
		}else if (broj3 < broj1 && broj1 < broj2){
			System.out.println("Sortirani brojevi su: " + broj3 + " " + broj1 + " " + broj2);
		}else if (broj3 < broj2 && broj2 < broj1){
			System.out.println("Sortirani brojevi su: " + broj3 + " " + broj2 + " " + broj1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //skener
		System.out.println("Unesite tri broja: "); // unos tri broja
		double broj1 = input.nextDouble();
		double broj2 = input.nextDouble();
		double broj3 = input.nextDouble();
		ispisiSortiraneBrojeve(broj1, broj2, broj3); // poziv metode
		input.close(); // zatvaramo skener

	}

}
