package src;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //skener
		System.out.println("Unesite ASCII code: "); //unos broja
		int ascii = input.nextInt();
		if (ascii >= 0 && ascii <= 127) { //ispitujemo da li je broj u dozvoljenom intervalu
			System.out.println("Karakter za ASCII code " + ascii + " je: " + (char) ascii); // ako jeste ispisujemo karakter
		}else {
			System.out.println("Uneseni ASCII code mora biti izmedju 0 i 127."); // ako nije ispisujemo poruku u koje razmakumora biti
		}
		input.close(); //zatvaramo skener

	}

}
