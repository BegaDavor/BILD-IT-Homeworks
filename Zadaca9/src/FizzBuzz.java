package src;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int broj = unos.nextInt();
		if (broj%3 == 0 && broj%5 != 0){
			System.out.println("Fizz.");
		}else if (broj%5 == 0 && broj%3 != 0){
			System.out.println("Buzz.");
		}else if (broj%3 == 0 && broj%5 == 0){
			System.out.println("FizzBuzz.");
		}else {
			System.out.println(broj);
		}
		unos.close();

	}

}
