package src;

import java.util.Scanner;

public class BrojSlova {
	 public static int countLetters(String s){
		 int counter = 0;
		 for (int i = 0; i < s.length(); i++){
			 if (Character.isLetter(s.charAt(i))){
				 counter++;
			 }
		 }
		 return counter;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String s = input.nextLine();
		int brojSlova = countLetters(s);
		System.out.println("Sring " + "\"" + s + "\"" + " ima " + brojSlova + " slova." );
		input.close();

	}

}
