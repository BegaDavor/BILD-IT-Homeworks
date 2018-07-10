package src;

import java.util.Scanner;

public class BrojDanaUMjesecu {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); //Skener
		String mjesec = ""; // inicijaliziramo string mjesec
		System.out.println("Unesite mjesec: "); // trazimo unos rednog broja mjeseca i godine
		int brojMjeseca = input.nextInt();
		System.out.println("Unesite godinu: ");
		int godina = input.nextInt();
		if (godina > 0){ // uslov za godinu
		switch (brojMjeseca){ // switch za ime mjeseca
		case 1 : mjesec = "Januar"; break;
		case 2 : mjesec = "Februar"; break;
		case 3 : mjesec = "Mart"; break;
		case 4 : mjesec = "April"; break;
		case 5 : mjesec = "Maj"; break;
		case 6 : mjesec = "Juni"; break;
		case 7 : mjesec = "Juli"; break;
		case 8 : mjesec = "Avgust"; break;
		case 9 : mjesec = "Septembar"; break;
		case 10 : mjesec = "Oktobar"; break;
		case 11 : mjesec = "Novembar"; break;
		case 12 : mjesec = "Decembar"; break;
		default : System.out.println("Broj mjeseca mora biti izmedju 1 i 12");
		}
		if (brojMjeseca==2){ // provjera da li je godina prestupna odnosno da li februar ima 28 ili 29 dana
			if(godina%400==0 || (godina%100!=0 && godina%4==0)){
				System.out.println(mjesec + " " + godina + ". ima 29 dana."  );
			}else {
				System.out.println(mjesec + " " + godina + ". ima 28 dana." );
			}
		}else if (brojMjeseca == 1 || brojMjeseca == 3 || brojMjeseca == 5 ||brojMjeseca == 7 || brojMjeseca == 8 || brojMjeseca == 10 || brojMjeseca == 12 ){
			System.out.println(mjesec + " " + godina + ". ima 31 dana." ); //mjeseci sa 31 danom
		}else if (brojMjeseca == 4 || brojMjeseca == 6 || brojMjeseca == 9 || brojMjeseca == 11){
			System.out.println(mjesec + " " + godina + ". ima 30 dana." ); //mjeseci sa 30 dana.
			}
			}else {System.out.println("Broj godine mora biti pozitivan broj.");}
	
		input.close(); //zatvaranje skenera

	}

}
