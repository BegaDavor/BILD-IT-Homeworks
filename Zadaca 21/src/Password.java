package src;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password: ");
		String pass = input.nextLine();
		provjeraPass(pass);
		input.close();
	}

	public static void provjeraPass(String s) {
		boolean pitanje = true;
		int counter = 0;

		if (s.length() < 8) {
			pitanje = false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetterOrDigit(s.charAt(i))) {
					pitanje = false;
					break;
				} else if (Character.isDigit(s.charAt(i))) {
					counter++;
				}
			}
		}

		if (pitanje && counter >= 2) {
			System.out.println("Password je validan.");
		} else {
			System.out.println("Password nije validan.");
		}
	}

}
