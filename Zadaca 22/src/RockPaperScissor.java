package src;

import java.util.Scanner;

public class RockPaperScissor {
	public static void RPS() {
		int korisnik;
		Scanner input = new Scanner(System.in);
		int brojacPobjedaKorisnik = 0;
		int brojacPobjedaKompijuter = 0;
		while (brojacPobjedaKorisnik != 2 && brojacPobjedaKompijuter != 2) {
			System.out.println("Unesite 0 (makaze), 1 (papir) ili 2 (kamen): ");
			korisnik = input.nextInt();
			switch (korisnik) {
			case 0:
				System.out.print("Izabrali ste makaze. ");
				int kompijuter = (int) (Math.random() * 3);
				switch (kompijuter) {
				case 0:
					System.out.println("Racunar je izabrao makaze. Nerijeseno je.");
					break;
				case 1:
					System.out.println("Racunar je izabrao papir. Pobijedili ste.");
					brojacPobjedaKorisnik++;
					brojacPobjedaKompijuter = 0;
					break;
				case 2:
					System.out.println("Racunar je izabrao kamen. Racunar je pobijedio.");
					brojacPobjedaKompijuter++;
					brojacPobjedaKorisnik = 0;
					break;
				}
				break;
			case 1:
				System.out.print("Izabrali ste papir. ");
				kompijuter = (int) (Math.random() * 3);
				switch (kompijuter) {
				case 0:
					System.out.println("Racunar je izabrao makaze. Racunar je pobijedio.");
					brojacPobjedaKompijuter++;
					brojacPobjedaKorisnik = 0;
					break;
				case 1:
					System.out.println("Racunar je izabrao papir. Nerijeseno je.");
					break;
				case 2:
					System.out.println("Racunar je izabrao kamen. Pobijedili ste.");
					brojacPobjedaKorisnik++;
					brojacPobjedaKompijuter = 0;
					break;
				}
				break;
			case 2:
				kompijuter = (int) (Math.random() * 3);
				System.out.print("Izabrali ste kamen. ");
				switch (kompijuter) {
				case 0:
					System.out.println("Racunar je izabrao makaze. Pobijedili ste.");
					brojacPobjedaKorisnik++;
					brojacPobjedaKompijuter = 0;
					break;
				case 1:
					System.out.println("Racunar je izabrao papir. Racunar je pobijedio.");
					brojacPobjedaKompijuter++;
					brojacPobjedaKorisnik = 0;
					break;
				case 2:
					System.out.println("Racunar je izabrao kamen. Nerijeseno je.");
					break;
				}
				break;
			default:
				System.out.println("Unijeli ste pogresan broj.");
			}
		}
		if (brojacPobjedaKompijuter > brojacPobjedaKorisnik) {
			System.out.println("Pobjednik je racunar.");
		} else {
			System.out.println("Vi ste pobijedili.");
		}
		input.close();
	}

	public static void main(String[] args) {
		RPS();

	}
}
