package src;

public class generisanjeNiza {
	public static int[] generateArray() {
		int[] niz = new int[10];
		for (int i = 0; i < 10; i++) {
			niz[i] = (int) (Math.random()*10);
		}
		return niz;
	}

	public static void main(String[] args) {
		int [] niz = generateArray();
		System.out.println("Clanovi niza su: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(niz[i] + " ");
		}

	}

}
