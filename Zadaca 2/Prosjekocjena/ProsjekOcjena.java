package Prosjekocjena;

import java.util.Scanner;

public class ProsjekOcjena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite tri ocjene: ");
		int ocjena1 = unos.nextInt();
		int ocjena2 = unos.nextInt();
		int ocjena3 = unos.nextInt();
		double prosjek = (ocjena1 + ocjena2 + ocjena3)/3.0;
		if (ocjena1>0 && ocjena2>0 && ocjena3>0) {
			if (ocjena1<6 && ocjena2<6 && ocjena3<6){
			if (ocjena1 == 1 || ocjena2 == 1 || ocjena3 == 1) {
			System.out.println("Prosjek ocjena iznosi: 1");
			}else {
				System.out.println("Prosjek ocjena iznosi: " + prosjek);
			}
			}else{
				System.out.println("Ocjene su od 1 do 5!");
			}
		}else{
			System.out.println("Ocjene su od 1 do 5!");
		}

	}

}
