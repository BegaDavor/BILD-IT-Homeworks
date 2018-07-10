package src;

import java.util.Scanner;

public class kafa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite tezinu i cijenu prvog paketa: ");
		int tezina1 = unos.nextInt();
		double cijena1 = unos.nextDouble();
		double odnos1 = cijena1/tezina1;
		System.out.println("Unesite tezinu i cijenu drugog paketa: ");
		int tezina2 = unos.nextInt();
		double cijena2 = unos.nextDouble();
		double odnos2 = cijena2/tezina2;
		if (odnos1 < odnos2) {
			System.out.println("Bolju cijenu ima prvi paket.");
		} else if (odnos1 > odnos2) {
			System.out.println("Bolju cijenu ima drugi paket.");
		} else {
			System.out.println("Oba paketa imaju istu cijenu.");
		}
		unos.close();

	}

}
