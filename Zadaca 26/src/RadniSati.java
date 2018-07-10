package src;

public class RadniSati {

	public static void main(String[] args) {
		int[][] matrica = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 } };
		int[] sumaSati = new int[7];
		int[] max = new int[7];
		int redniBroj = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				sumaSati[i] = sumaSati[i] + matrica[i][j];
			}
		}
		System.out.println("Radnici poredani po broju sati i njihov ukupan broja sati: ");
		for (int i = 0; i < max.length; i++) {
			for (int j = 0; j < sumaSati.length; j++) {
				if (sumaSati[j] >= max[i]) {
					max[i] = sumaSati[j];
					redniBroj = j;
				}

			}
			System.out.print(redniBroj + " " + max[i]);
			System.out.println();
			sumaSati[redniBroj] = 0;
		}
	}

}
