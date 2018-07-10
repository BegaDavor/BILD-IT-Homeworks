package PBM;

import java.util.Scanner;

public class PBM {

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int a = (int) (0 + Math.random()*2);
		System.out.println("Unesite 0 (makaze), 1 (papir) ili 2 (bunar): ");
		int b = unos.nextInt();
		if (a == 0 && b == 0){
			System.out.println("Nerijeseno je.");
		}else if (a == 1 && b == 1){
			System.out.println("Nerijeseno je.");
		}else if (a == 2 && b == 2){
			System.out.println("Nerijeseno je.");
		}else if (b == 0 && a == 1){
			System.out.println("Izabrali ste makaze. Racunar je izabrao papir. Vi ste pobijedili.");
		}else if (b == 0 && a == 2){
			System.out.println("Izabrali ste makaze. Racunar je izabrao bunar. Racunar je pobijedio.");
		}else if (b == 1 && a == 0){
			System.out.println("Izabrali ste papir. Racunar je izabrao makaze. Racunar je pobijedio.");
		}else if (b == 1 && a == 2){
			System.out.println("Izabrali ste papir. Racunar je izabrao bunar. Vi ste pobijedili.");
		}else if (b == 2 && a == 0){
			System.out.println("Izabrali ste bunar. Racunar je izabrao makaze. Vi ste pobijedili.");
		}else if (b == 2 && a == 1){
			System.out.println("Izabrali ste bunar. Racunar je izabrao papir. Racunar je pobijedio.");
		}
		}

}
