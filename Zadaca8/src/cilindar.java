package src;

import java.util.Scanner;

public class cilindar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite radius i visinu cilindra: ");
		double r = unos.nextDouble();
		double H = unos.nextDouble();
		final double Pi = 3.14159265358979323846264338327950;
		double povrsina = 2*r*r*Pi+H*2*r*Pi;
		double zapremina = r*r*Pi*H;
		System.out.println("Povrsina cilindra iznosi " + povrsina);
		System.out.println("Zapremina cilindra iznosi " + zapremina);
		unos.close();

	}

}
