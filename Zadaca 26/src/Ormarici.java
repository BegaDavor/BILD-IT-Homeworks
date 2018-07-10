package src;

public class Ormarici {

	public static void main(String[] args) {
		int[] ormarici = new int[100];
		for (int ucenici = 1; ucenici <= ormarici.length; ucenici++) {
			if (ucenici == 1) {
				for (int i = 0; i < ormarici.length; i++) {
					ormarici[i] = 1;
				}
			} else {
				for (int i = ucenici - 1; i < ormarici.length;) {
					if (ormarici[i] == 1) {
						ormarici[i] = 0;
					} else {
						ormarici[i] = 1;
					}
					i = i + ucenici;
				}
			}
		}
		System.out.println("Ormarici koji su ostali otvoreni su: ");
		for (int i = 0; i < ormarici.length; i++) {
			if (ormarici[i] == 1) {
				System.out.print((i + 1) + " ");
			}
		}

	}

}
