package src;

import java.util.Scanner;

public class DaniUSedmici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj izmedju 1 i 7: ");
		int broj = input.nextInt();
		if (broj > 0 && broj < 8){
		switch (broj){
		case 1 : System.out.println("Izabrani dan je: Ponedjeljak."); break;
		case 2 : System.out.println("Izabrani dan je: Utorak."); break;
		case 3 : System.out.println("Izabrani dan je: Srijeda."); break;
		case 4 : System.out.println("Izabrani dan je: Cetvrtak."); break;
		case 5 : System.out.println("Izabrani dan je: Petak."); break;
		case 6 : System.out.println("Izabrani dan je: Subota."); break;
		case 7 : System.out.println("Izabrani dan je: Nedjelja."); 
		
			}
		}else {
			System.out.println("Broj mora biti izmedju 1 i 7!");
		}
		input.close();
	}

}
