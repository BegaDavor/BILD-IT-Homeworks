package src;

import java.util.Scanner;

public class NaopakoBroj {
	public static void naopakoBroj(int broj) { // metoda za ispisivanje broja naopako
		while (broj != 0) {
			int broj1 = broj % 10;
			broj = broj/10;
			System.out.print(broj1);
		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki prirodan broj: "); // unos broja
		int broj = input.nextInt();
		if (broj > 0){ //trazimo da brojevi budu prirodni
			System.out.print("Obrnut broj je: "); // izvrsavanje metode
			naopakoBroj(broj);
		}else {
			System.out.println("Broj mora biti prirodan."); // poruka ako broj nije prirodan
		}
		input.close();

	}

}
