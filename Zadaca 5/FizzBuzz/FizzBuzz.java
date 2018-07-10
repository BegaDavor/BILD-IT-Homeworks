package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int a = unos.nextInt();
		if (a%3==0 && a%5!=0){
			System.out.println("Fizz.");
		}else if (a%5==0 && a%3!=0){
			System.out.println("Buzz.");
		}else if (a%3==0 && a%5==0){
			System.out.println("FizzBuzz.");
		}else {
			System.out.println(a);
		}

	}

}
