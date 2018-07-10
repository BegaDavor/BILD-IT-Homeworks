package src;

import java.util.Scanner;

public class ConverterBinToDec {
public	static void uBinarni(int broj){//metoda koja pretvara decimalni u binarni broj
	    int cifre[] = new int[100]; //napravimo niz koji ce cuvati cifre binarne reprezentacije
	    int i = 0;
	    while (broj > 0){ // petlja koja pretvara decimalni broj u binarni, ali napoako
	        cifre[i] = broj%2; // cifra binarnog broja
	        i++;
	        broj = broj/2; // dijelimo broj sa 2
	    }
	    for (int j = i - 1 ; j >= 0 ; j--){ //ispisujemo binarni broj ispravno
	        System.out.print(cifre[j]);
	    }
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite neki broj: "); // unos broja
		int broj = input.nextInt();
		System.out.println("Binarna reprezentacija broja " + broj + " je: ");
		uBinarni(broj); // poziv metode
		input.close(); // zatvaramo skener

	}

}
