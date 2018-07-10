package Djeljivost;

import java.util.Scanner;

public class Djeljivost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int a = unos.nextInt();
		System.out.println("Da li je broj djeljiv i sa 5 i sa 6?");
		if (a%5==0 && a%6==0){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("Da li je broj djeljiv sa 5 ili sa 6?");
		if (a%5==0 || a%6==0){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("Da li je broj djeljiv sa 5 ili sa 6, ali nije sa oba?");
		if (a%5==0 ^ a%6==0){
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
