package src;

import java.util.Scanner;

public class PrestupneGodine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int godina1, godina2, i, j=0;
		System.out.println("Unesite pocetnu godinu: ");
		godina1 = input.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		godina2 = input.nextInt();
			for (i = godina1; i<=godina2; i++) {
				if ((i % 4 == 0 && i % 100 != 100) || i % 400==0) {
				j++;
				if (j%10 == 0) {
					System.out.println(i);
				}else {
					System.out.print(i + " ");
				}
			}
		}
			input.close();

	}

}
