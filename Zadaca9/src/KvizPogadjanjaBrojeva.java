package src;

import java.util.Scanner;

public class KvizPogadjanjaBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int zamisljeniBroj = (int) (1 + Math.random()*10);
		System.out.println("Zamislio sam broj izmedju 1 i 10. Pokusaj pogoditi: ");
		int korisnikovBroj = unos.nextInt();
		if (korisnikovBroj > 0 && korisnikovBroj < 11){
		if (zamisljeniBroj < korisnikovBroj){
			System.out.println("Previsoko. Broj koji sam zamislio je " + zamisljeniBroj);
		}else if (zamisljeniBroj > korisnikovBroj){
			System.out.println("Prenisko. Broj koji sam zamislio je " + zamisljeniBroj);
		}else if (zamisljeniBroj == korisnikovBroj){
			System.out.println("Svaka cast. Broj koji sam zamislio je " + zamisljeniBroj);
		}
		}else {
			System.out.println("Unos nije dobar, broj mora biti izmedju 1 i 10!");
		}
		unos.close();

	}

}
