package PiliG;

import java.util.Scanner;

public class PismoIliGlava {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int a = (int) (Math.random()*10)%2;
		System.out.println("Unesite ishod bacanja novcica (0 - pismo, 1 - glava): ");
		int b = unos.nextInt();
			if (b == 0 || b == 1){
			if (a == b){
				System.out.println("Svaka cast, pogodili ste.");
			}else if (a == 0){
				System.out.println("Pogrijesili ste, ishod je pismo.");
			}else if (a == 1) {
				System.out.println("Pogrijesili ste, ishod je glava.");
			}
		}else {
			System.out.println("Unos je pogresan!");
		}

	

	}

}
