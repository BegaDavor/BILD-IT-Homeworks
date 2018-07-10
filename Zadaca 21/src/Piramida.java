package src;

import java.util.Scanner;

public class Piramida {
	public static void piramida(int pocetniBroj, int krajnjiBroj) {
		for (int i = 1; i <= krajnjiBroj; i++) {
			for (int j = 1; j <= krajnjiBroj - i; j++) {
				System.out.print("   ");

			}
			for (int k = pocetniBroj; k <= i; k++) {
				System.out.print(k + "  ");
			}
			for (int l = i - 1; l >= pocetniBroj; l--) {

				System.out.print(l + "  ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetni i kranji broj: ");
		int pocetniBroj = input.nextInt();
		int krajnjiBroj = input.nextInt();
		piramida(pocetniBroj, krajnjiBroj);
		input.close();
	}

}
