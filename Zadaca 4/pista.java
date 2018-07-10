package pista;

import java.util.Scanner;

public class pista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite brzinu (m/s) i ubrzanje (m/s^2): ");
		double v = unos.nextDouble();
		double a = unos.nextDouble();
		double duzina = (v*v)/(2*a);
		System.out.println("Minimalna duzina piste za ovaj avion izbnosi: " + duzina + " m");

	}

}
