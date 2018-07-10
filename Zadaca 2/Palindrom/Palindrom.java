package Palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite cijeli trocifren broj: ");
		int broj = unos.nextInt();
		if (broj<1000){
			int jedinice = broj % 10;
			int desetice = (broj/10)%10;
			int stotice = (broj/10)/10;
			if (jedinice == stotice){
				System.out.println("Broj " + broj + " je palindrom.");
			}else {
				System.out.println("Broj " + broj + " nije palindrom.");
			}
		}else {
			System.out.println("Broj mora biti trocifren.");
		}

	}

}
