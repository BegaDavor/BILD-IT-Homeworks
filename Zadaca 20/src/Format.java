package src;

import java.util.Scanner;

public class Format {
	public static String format(int number, int width) {
		String format = "" + number;
		int brojacCifara = 0;
		while (number != 0) {
			number = number / 10;
			brojacCifara++;
		}
		if (width <= brojacCifara) {
			return format;
		}else if (width > brojacCifara) {
			for (int i = 1; i <= (width-brojacCifara); i++) {
				format = "0" + format;
			}
		}
		return format;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int number = input.nextInt();
		System.out.println("Unesite duzinu: ");
		int width = input.nextInt();
		System.out.println("Formatiran broj " + number + " je: " + format(number, width));
		input.close();

	}

}
