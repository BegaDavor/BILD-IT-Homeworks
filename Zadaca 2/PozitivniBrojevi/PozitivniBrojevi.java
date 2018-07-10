package PozitivniBrojevi;

import java.util.Scanner;

public class PozitivniBrojevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dva cijela broja: ");
		int a = unos.nextInt();
		int b = unos.nextInt();
		if (a>0 && b>0){
			System.out.println("Oba broja su pozitivna.");
		}else {
			if (a<0 && b<0){
				System.out.println("Oba broja su negativna. ");
			}else if (a<0){
				System.out.println("Broj " + a + " je negativan.");
			}else if (b<0){
				System.out.println("Broj " + b + " je negativan.");
			}
		}

	}

}
