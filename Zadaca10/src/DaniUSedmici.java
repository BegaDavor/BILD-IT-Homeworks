package src;

import java.util.Scanner;

public class DaniUSedmici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String prviDan = "";
		String drugiDan = "";
		System.out.println("Uneiste danasnji dan: ");
		int pocetniDan = input.nextInt();
		if (pocetniDan >= 0 && pocetniDan <= 6){
		System.out.println("Unesite dan u buducnosti: ");
		int danUBuducnosti = input.nextInt();
		int zbir = pocetniDan + danUBuducnosti;
		int dan = zbir%7;
		switch (pocetniDan){
		case 0 : prviDan = "ponedjeljak"; break;
		case 1 : prviDan = "utorak"; break;
		case 2 : prviDan = "srijeda"; break;
		case 3 : prviDan = "cetvrtak"; break;
		case 4 : prviDan = "petak"; break;
		case 5 : prviDan = "subota"; break;
		case 6 : prviDan = "nedjelja"; 
		
		}
		switch (dan){
		case 0 : drugiDan = "ponedjeljak"; break;
		case 1 : drugiDan = "utorak"; break;
		case 2 : drugiDan = "srijeda"; break;
		case 3 : drugiDan = "cetvrtak"; break;
		case 4 : drugiDan = "petak"; break;
		case 5 : drugiDan = "subota"; break;
		case 6 : drugiDan = "nedjelja";
	
		}
		System.out.println("Danas je " + prviDan + ", dan u buducnosti je " + drugiDan + ".");

		}else {System.out.println("Broj mora biti izmedju 0 i 6.");}
		input.close();
	}

}
