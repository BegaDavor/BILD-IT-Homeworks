package src;

import java.util.Scanner;

public class Sablon {
	public static void sablon(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print("  ");
			}

			for (int z = i; z >= 1; z--) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj do koje zelite da sablon ide: ");
		int n = input.nextInt(); // broj redova
		sablon(n);
		input.close();

	}

}
