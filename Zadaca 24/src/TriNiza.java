package src;

public class TriNiza {

	public static void main(String[] args) {
		int[] niz = new int[1000];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 1000);
		}
		int[] nizJednocifrenih = new int[1000];
		int[] nizDvocifrenih = new int[1000];
		int[] nizTrocifrenih = new int[1000];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < 10 || niz[i] == 0) {
				nizJednocifrenih[i] = niz[i];
			} else if (niz[i] < 100 && niz[i] >= 10) {
				nizDvocifrenih[i] = niz[i];
			} else if (niz[i] < 1000 && niz[i] >= 100) {
				nizTrocifrenih[i] = niz[i];
			}
		}
		for (int j = 0; j < nizJednocifrenih.length; j++) {
			System.out.print(nizJednocifrenih[j] + " ");
		}
		System.out.println();
		for (int k = 0; k < nizDvocifrenih.length; k++) {
			System.out.print(nizDvocifrenih[k] + " ");
		}
		System.out.println();
		for (int l = 0; l < nizTrocifrenih.length; l++) {
			System.out.print(nizTrocifrenih[l] + " ");
		}

	}

}
