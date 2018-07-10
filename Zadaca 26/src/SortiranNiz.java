package src;

import java.util.Scanner;

public class SortiranNiz {
	public static boolean isSortiran(int[] niz) {
		boolean sortiran = false;
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] <= niz[i + 1]) {
				sortiran = true;
			}else {
				sortiran = false;
				break;
			}
		}
		return sortiran;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzinaNiza = input.nextInt();
		int[] niz = new int[duzinaNiza];
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza: ");
			niz[i] = input.nextInt();
		}
		if (isSortiran(niz) == true) {
			System.out.println("Niz je sortiran.");
		} else {
			System.out.println("Niz nije sortiran.");
		}
		input.close();

	}

}
