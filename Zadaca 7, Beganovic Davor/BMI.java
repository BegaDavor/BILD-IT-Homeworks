package BMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite svoju tezinu u kg (npr. 63): ");
		double tezina = unos.nextDouble();
		System.out.println("Unesite svoju visinu u metrima (npr. 1.63): ");
		double visina = unos.nextDouble();
		double BMI = tezina/(visina*visina);
		System.out.println("Vas BMI iznosi: " + BMI);
		unos.close();

	}

}
