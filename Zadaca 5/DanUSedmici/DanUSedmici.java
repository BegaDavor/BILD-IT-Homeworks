package DanUSedmici;

import java.util.Scanner;

public class DanUSedmici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijeli broj izmedju 1 i 7: ");
		int a = unos.nextInt();
		if (a>0 && a<8){
			if (a == 1){
				System.out.println("Izabrani dan je: ponedjeljak");
			}else if (a == 2){
				System.out.println("Izabrani dan je: utorak");
			}else if (a == 3){
				System.out.println("Izabrani dan je: srijeda");
			}else if (a == 4){
				System.out.println("Izabrani dan je: cetvrtak");
			}else if (a == 5){
				System.out.println("Izabrani dan je: petak");
			}else if (a == 6){
				System.out.println("Izabrani dan je: subota");
			}else if (a == 7){
				System.out.println("Izabrani dan je: nedjelja");
			}
		}else {
			System.out.println("Broj mora biti izmedju 1 i 7!");
		}

	}

}
