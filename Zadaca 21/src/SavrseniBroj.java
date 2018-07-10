package src;

public class SavrseniBroj {

	public static boolean savrsenBroj(int broj) { // metoda koja ispituje da li broj savrsen
		int djelitelj = 0;
		boolean savrsen = false;
		for (int i = 1; i < broj; i++) {
			if (broj % i == 0) {
				djelitelj = djelitelj + i;

			}
			if (djelitelj == broj) {
				savrsen = true;
			} else {
				savrsen = false;

			}

		}
		return savrsen;

	}

	public static void main(String[] args) {
		System.out.println("Savrseni brojevi izmedju 0 i 10 000 su: ");
		for (int i = 1; i <= 10000;) { // prolazak kroz brojeve od 1 do 10000

			if (savrsenBroj(i) == true) { // ako je savrsen ispisujega i trazi dalje
				System.out.println(i);
				i++;
			} else {
				i++;
			} // ako nije trazi dalje

		}

	}

}
