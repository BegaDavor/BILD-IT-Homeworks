package src;

import java.util.Scanner;

public class BrojPonavljanjaKaraktera {
	public static int brojacKaraktera(String str, char ch){ // metoda koja broji karaktere
		int counter = 0;
		for (int i = 0; i < str.length(); i++ ){
			if (str.charAt(i) == ch){
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		char ch = ' ';
		System.out.println("Unesite neki string: "); // unos stringa
		String s = input.nextLine();
		System.out.println("Unesite karakter koji zelite da prebrojite: "); // unos karaktera
		String karakter = input.next(); 
		input.close(); // zatvaramo skener
		if (karakter.length() < 2) {
			ch = karakter.charAt(0);
		}else {System.out.println("Morate unijeti samo jedan karakter!");return;}
		System.out.println("Broj ponavljanja karaktera " +"'" + ch + "'" + " u stringu " + "\"" + s + "\" je: " + brojacKaraktera(s, ch)); // ispis broja karaktera
		
	}

}
