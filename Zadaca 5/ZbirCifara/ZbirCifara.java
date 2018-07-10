package ZbirCifara;

import java.util.Scanner;

public class ZbirCifara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite trocifren broj: ");
		int broj = unos.nextInt();
		if (broj > 99 && broj < 1000 ) {
			int jedinice = broj % 10;
			int desetice = (broj/10)%10;
			int stotice = (broj/10)/10;
			int zbir = jedinice+desetice+stotice;
			System.out.println("Zbir cifara je: " + zbir );
			}else {
				System.out.println("Broj mora biti trocifren!");
			}
	    }	
		

}
