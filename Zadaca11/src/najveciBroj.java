package src;

import java.util.Scanner;

public class najveciBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj (0 prekida unos): ");
		int broj = input.nextInt();
		int brojac = 0;
		int najveci = 0;
		while (broj != 0) {
		
			if (broj == najveci){
				brojac++;
			}else if (broj > najveci){
				najveci = broj;
				brojac = 1;
			}
			broj = input.nextInt();
		}
		System.out.println("Najveæi unijeti broj je " + najveci + " , a unijeli ste ga " + brojac + " puta.");
		input.close();

	}

}
