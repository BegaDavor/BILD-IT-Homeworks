package NasumicanBroj;

import java.util.Scanner;

public class NasumicanBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int a = (int) (1 + Math.random()*10);
		System.out.println("Zamislio sam broj izmedju 1 i 10. Pokusaj pogoditi: ");
		int b = unos.nextInt();
		if (b>0 && b<11){
		if (a<b){
			System.out.println("Previsoko. Broj koji sam zamislio je " + a);
		}else if (a>b){
			System.out.println("Prenisko. Broj koji sam zamislio je " + a);
		}else if (a == b){
			System.out.println("Svaka cast. Broj koji sam zamislio je " + a);
		}
		}else {
			System.out.println("Unos nije dobar, broj mora biti izmedju 1 i 10!");
		}

	}

}
