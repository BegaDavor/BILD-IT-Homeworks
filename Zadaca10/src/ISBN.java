package src;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		System.out.println("Unesite prvih 9 ISBN brojeva: ");
		d1 = input.nextInt();
		d2 = input.nextInt();
		d3 = input.nextInt();
		d4 = input.nextInt();
		d5 = input.nextInt();
		d6 = input.nextInt();
		d7 = input.nextInt();
		d8 = input.nextInt();
		d9 = input.nextInt();
		int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
		if (d10 == 10){
			System.out.println("ISBN-10 broj je: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		}else {
			System.out.println("ISBN-10 broj je: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		}
		input.close();
		
	

	}

}
