package src;

import java.util.Scanner;

public class KarakterKojiSeNePonavlja {
	public static int count(String str, char a){ // metod koji broji karaktere
		int counter = 0;
		for (int i = 0; i < str.length(); i++ ){
			if (str.charAt(i) == a){
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener	
		System.out.println("Unesite string: "); // unos stringa
		String unos = input.nextLine();
		System.out.println("Prvi karakter koji se ne pojavljuje u ostatku stringa je: ");
		for (int i = 0; i < unos.length(); i++) { //petlja koja prolazi kroz karaktere stringa
			if (count(unos, unos.charAt(i)) == 1) { //uslov zadatka
				System.out.print(unos.charAt(i));
				break;
			}
		}
		input.close(); //zatvaramo skener
	}

}
