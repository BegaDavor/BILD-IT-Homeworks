package Rastuci;

import java.util.Scanner;

public class Rastuci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite tri cijela broja: ");
		int a = unos.nextInt();
		int b = unos.nextInt();
		int c = unos.nextInt();
		if(a<b && a<c)
		{
			if(b<c)
			{
			System.out.print(a + " " + b + " " + c);
			}
			else
			{
				System.out.print(a + " " + c + " " +b);
			}
		}
		else if(b<a && b<c)
		{
			if(a<c)
			{
			System.out.print(b + " " + a + " " + c);
			}
			else
			{
				System.out.print(b + " " + c + " " + a);
			}
		}
		else if(c<b && c<a)
		{
			if(b<a)
			{
			System.out.print(c + " " + b + " " + a);
			}
			else
			{
				System.out.print(c + " " + a + " " + b);
			}
		}

	}

}
