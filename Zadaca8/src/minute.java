package src;

import java.util.Scanner;

public class minute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj minuta: ");
		int minute = unos.nextInt();
		int godine = minute / 525600;
		int dani = (minute % 525600) / 1440;
		System.out.println(minute + " minuta je otprilike " + godine + " godina i " + dani + " dana");
		unos.close();

	}

}
