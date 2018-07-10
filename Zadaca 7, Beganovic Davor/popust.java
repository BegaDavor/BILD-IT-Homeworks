package popust;

import java.util.Scanner;

public class popust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vrijednost robe u KM: ");
		double vrijednostKM = unos.nextDouble();
		System.out.println("Unesite popust na gotovinsko placanje u procentima: ");
		double popust = unos.nextDouble();
		double vrijednostPopusta = vrijednostKM*(popust/100);
		System.out.println("Vrijednost popusta je: " + vrijednostPopusta + " KM");
		double cijena = vrijednostKM-vrijednostPopusta;
		System.out.println("Vrijednost robe sa popustom je: " + cijena + " KM");
		unos.close();

	}

}
