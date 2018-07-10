package putovanje;

import java.util.Scanner;

public class putovanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu puta u kilometrima: ");
		double kilometri = unos.nextDouble();
		System.out.println("Unesite potrosnju auta (koliko kilometara moze preci sa litrom goriva): ");
		double potrosnja = unos.nextDouble();
		System.out.println("Unesite cijenu litre goriva u markama: ");
		double cijenagoriva = unos.nextDouble();
		double cijena = (kilometri/potrosnja)*cijenagoriva;
		System.out.println("Ukupna cijena putovanja iznosi: " + cijena);
		unos.close();
		
	}

}
