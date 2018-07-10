package src;

import java.util.Scanner;

public class Faktorijel {
	public static int faktorijel(int broj){
		int faktorijel = 1;
		while (broj != 0){
		faktorijel = faktorijel * broj;
		broj--;
		}
		return faktorijel;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj kojem zelite izracunati faktorijel (!): ");
		int broj = input.nextInt();
		System.out.println("Faktorijel broja " + broj + " (" + broj + "!) je: " + faktorijel(broj) );
		input.close();

	}

}
