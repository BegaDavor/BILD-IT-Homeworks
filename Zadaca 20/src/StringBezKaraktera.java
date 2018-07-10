package src;

import java.util.Scanner;

public class StringBezKaraktera {
	public static String ukloniKarakter(String str, char ch) {
		String noviStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				noviStr = noviStr + str.charAt(i);
			} else {

			}
		}
		return noviStr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		char ch = ' ';
		System.out.println("Unesite neki string: ");
		String str = input.nextLine();
		System.out.println("Unesite karakter koji zelite da uklonite: "); 
		String karakter = input.next(); 
		input.close(); 
		if (karakter.length() < 2) {
			ch = karakter.charAt(0);
		}else {System.out.println("Morate unijeti samo jedan karakter!");return;}
		System.out.println("Uneseni string, bez karaktera '" + ch + "' je: " );
		System.out.println(ukloniKarakter(str, ch));

	}

}
