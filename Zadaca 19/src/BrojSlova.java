package src;

import java.util.Scanner;

public class BrojSlova {
	 public static int prebrojiSlova(String s){ // metoda koja broji slova
		 int counter = 0;
		 for (int i = 0; i < s.length(); i++){
			 if (Character.isLetter(s.charAt(i))){
				 counter++;
			 }
		 }
		 return counter;
	 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //skener
		System.out.println("Unesite neki string: "); //unos stringa
		String s = input.nextLine();
		int brojSlova = prebrojiSlova(s); // poziv metode
		System.out.println("Sring " + "\"" + s + "\"" + " ima " + brojSlova + " slova." ); // ispis koliko ima slova uneseni string
		input.close(); // zatvaramo skener

	}

}
