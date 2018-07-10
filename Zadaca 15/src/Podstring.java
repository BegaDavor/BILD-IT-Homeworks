package src;

import java.util.Scanner;

public class Podstring {
	public static boolean jePodstring(String string1, String string2){ // metoda za provjeravanje da li ima substringova
		boolean podstring = true;
		for(int i=0 ; i < string1.length(); i++){ // prolazak kroz slova prvog stringa
		for(int j=0;j < string2.length();j++){ // prolazak kroz slova drugog stringa
			if(string1.charAt(i) == string2.charAt(j)){ // ispitujemo jednakost stringa 
				for(int k=i; k < string1.length(); k++){  // ako jesu jednaki, nastavljamo dalje sa slovima
					if(string2.length() > j){
					if(string1.charAt(k) != string2.charAt(j)){ // ako naidjemo na razlicita slova 
						podstring=false;
						break;
						}
					}
					j++; // pregledamo sljedece slovo drugog stringa
				}
			}
		}
		}
		return podstring;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite prvi string: "); // unos stringova
		String string1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String string2 = input.nextLine();
		if (string1.length() > string2.length()){ // ako je prvi veci string
		if (jePodstring(string1, string2) == true){ // pozivanje metode
			System.out.println("String " + string2 + " je podstring stringa " + string1 + ".");
		}else {
			System.out.println("String " + string2 + " nije podstring stringa " + string1 + ".");
		}
		}else if (string2.length() > string1.length()){ // ako je drugi veci
			if (jePodstring(string2, string1) == true){
				System.out.println("String " + string1 + " je podstring stringa " + string2 + ".");
			}else {
				System.out.println("String " + string1 + " nije podstring stringa " + string2 + ".");
			}
		}else if (string1.equals(string2)){ // ako su jednaki
			System.out.println("Stringovi su jednaki.");
		}
		input.close(); // zatvaramo skener

	}

}
