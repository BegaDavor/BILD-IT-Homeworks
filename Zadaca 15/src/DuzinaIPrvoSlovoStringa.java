package src;

import java.util.Scanner;


public class DuzinaIPrvoSlovoStringa {
	public static char firstLetter(String recenica){ // metoda koja pronalazi prvo slovo u stringu
		char prvoSlovo = ' ';
		for (int i = 0 ; i < recenica.length(); i++){
			if (Character.isLetter(recenica.charAt(i))){
				prvoSlovo = recenica.charAt(i);
				break;
			}
		}
		return  prvoSlovo;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite neki string: "); // unos stringa
		String recenica = input.nextLine();
		if (Character.isLetter(firstLetter(recenica))){ // ispitujemo da li string uopste ima slova
		System.out.println("Duzina stringa je " + recenica.length() + ", a prvo slovo stringa je: " + firstLetter(recenica) + "."); // ispis duzine i prvog slova
		}else {
			System.out.println("Unijeli ste string bez slova.");
		}
		
		input.close();

	}

}
