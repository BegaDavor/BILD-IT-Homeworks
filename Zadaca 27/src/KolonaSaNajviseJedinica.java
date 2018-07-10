package src;

public class KolonaSaNajviseJedinica {
	public static int[][] generirajMatricu(){
		int[][] matrica = new int[4][4];
		for(int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (int) ((Math.random()*10)%2);
			}
		}
		return matrica;
	}
	public static int najveciElement(int[] niz) {
		int redniBroj = 0;
		int max = 0;
		for (int i = 0; i < niz.length; i++) {
				if (niz[i] > max) {
					max = niz[i];
					redniBroj = i;
					
				}
			}
		
		return redniBroj;
	}
	

	public static void main(String[] args) {
		int[][] matrica = generirajMatricu();
		int[] red = new int[matrica[0].length];
		int[] kolona = new int[matrica.length];
		for(int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica[i].length; j++) {
				red[i] = red[i] + matrica[i][j];
			}
		}
		System.out.println("Red sa najvise jedinica je: " + najveciElement(red));
		for(int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica[i].length; j++) {
				kolona[i] = kolona[i] + matrica[j][i];
			}
		}
		System.out.println("Kolona sa najvise jedinica je: " + najveciElement(kolona));

	}

}
