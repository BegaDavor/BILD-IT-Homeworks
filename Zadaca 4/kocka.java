package kocka;

import java.util.Scanner;

public class kocka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu ivice kocke u cm: ");
		double a = unos.nextDouble();
		double o = 12*a;
		double p = 6*a*a;
		System.out.println("Obim kocke cija je ivica " + a + " cm iznosi: " + o + " cm" );
		System.out.println("Povrsina kocke cija je ivica " + a + " cm iznosi: " + p + " cm^2" );


	}

}
