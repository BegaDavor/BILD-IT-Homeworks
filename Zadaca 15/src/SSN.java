package src;

import java.util.Scanner;

public class SSN {
	public static boolean ispravno(String SSN){ // metoda koja ispituje ispravnost SSN-a
		boolean ispravno = false;
		if (SSN.length() <= 11){ // da li je duzina stringa odgovorajuca
			for (int i = 0; i <= 10; i++){ // prolazimo kroz string
				for (i = 0 ; i <= 2; i++){ // da li su prva tri karaktera brojevi
					if (Character.isDigit(SSN.charAt(i))){
						ispravno = true;
					}else {
						ispravno = false;
						}
				}
				if (ispravno == false){break;} // prekidamo ako uslov nije zadovoljen
				if (SSN.charAt(3) == '-'){ // ispitujemo da li je cetvrti karakter '-'
					ispravno = true;
				}else {
					ispravno = false;
					break;
				}
				for (i = 4; i <= 5; i++){ // da li je 5. i 6. karakter broj
					if (Character.isDigit(SSN.charAt(i))){
						ispravno = true;
					}else {
						ispravno = false;
						
					}
				}
				if (ispravno == false){break;}// prekidamo ako uslov nije zadovoljen
				if (SSN.charAt(6) == '-'){
					ispravno = true;
				}else {
					ispravno = false;
					break;
				}
				for (i = 7; i <= 10; i++){ // da li je od 8. do 10. karaktera broj
					if (Character.isDigit(SSN.charAt(i))){
						ispravno = true;
					}else {
						ispravno = false;
					
					}
				}
				if (ispravno == false){break;}// prekidamo ako uslov nije zadovoljen
			}
			
		}else {
			ispravno = false;
		}
		return ispravno; // vracamo true ili false za metodu
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj: ");
		String SSN = input.nextLine(); // unos stringa
		
		while (ispravno(SSN) == false){ // trazimo od korisnika da upisuje SSN dok ga ne upise pravilno
			System.out.println("SSN nije ispravan, unesite ponovo: ");
			SSN = input.nextLine();
		}
		if (ispravno (SSN) == true){ // ispisuje kad je SSN pravilan
			System.out.println("SSN je ispravan.");
		}
		input.close(); // zatvaramo skener

	}

}
