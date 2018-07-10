package src;

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		int broj1 = unos.nextInt();
		System.out.println("Unesite drugi broj:");
		int broj2 = unos.nextInt();
		System.out.println("Unesite treci broj:");
		int broj3 = unos.nextInt();
		if (broj1 > broj2 && broj1 > broj3){
			System.out.println("Najveci broj je: " + broj1);
		}else if (broj2 > broj1 && broj2 > broj3){
			System.out.println("Najveci broj je: " + broj2);
		}else if (broj3 > broj1 && broj3 > broj2){
			System.out.println("Najveci broj je: " + broj3);
		}
		unos.close();

	}

}
