package src;

import java.util.Scanner;

public class NZSiNZD {
	
	public static int nzs(int broj1, int broj2){
		int nzs = 1;
		while (nzs % broj1 !=0 || nzs % broj2 !=0 ){
			nzs++;
		}
		return nzs;
	}
	public static int nzd(int broj1, int broj2){
		return (broj1 * broj2)/nzs(broj1,broj2);
	
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Unesite dva cijela broja: ");
	int broj1 = input.nextInt();
	int broj2 = input.nextInt();
	if (broj1 > 0 && broj2 > 0){
		System.out.println("NZS za brojeve " + broj1 + " i " + broj2 + " je: " + nzs(broj1,broj2));
		System.out.println("NZD za brojeve " + broj1 + " i " + broj2 + " je: " + nzd(broj1,broj2));
	}else {
		System.out.println(" Brojevi moraju biti pozitivni! ");
	}
	input.close();

	}

}
