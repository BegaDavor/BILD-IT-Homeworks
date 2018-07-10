package src;

public class ArmstrongoviBrojevi {
	public static int stepeni(int broj) { // metoda koja razbija broj na cifre i sabira ih dignute na stepen njihove duzine
		int zbirStepena = 0;
		if (broj < 10) {
			zbirStepena = broj;
		}else if(broj >= 10 && broj < 100) {
			while (broj != 0) {
				zbirStepena =  zbirStepena + ((broj % 10)*(broj % 10));
				broj = broj / 10;
			}
		}else if (broj >= 100 && broj < 1000) {
			while (broj != 0) {
				zbirStepena =  zbirStepena + ((broj % 10)*(broj % 10)*(broj % 10));
				broj = broj / 10;
			}
		}
		return zbirStepena;
	}
	public static boolean armstrongoviBrojevi(int broj) { // metoda koja ispituje da li broj Armstrongov
		boolean armstrong = false;
		if (broj == stepeni(broj)) {
			armstrong = true;
		}else {armstrong = false;}
		return armstrong;
	}

	public static void main(String[] args) {
		System.out.println("Armstrongovi brojevi izmedju 0 i 1000 su: ");
		for (int i = 0; i < 1000; i++) { // ispis Armstrongovih brojeva izmedju 0 i 1000
			if (armstrongoviBrojevi(i) == true) {
				System.out.print(i + " ");
			}
		}

	}

}
