package src;

public class DjeljiviSa9 {

	public static void main(String[] args) {
		System.out.println("Brojevi djeljivi sa 9 u rasponu od 1 do 100: ");
		for (int i = 1; i <= 100; i++){ // petlja koja prolazi cijelim brojevima od 1 do 100
			if (i % 9 == 0){ // ispitujemo djeljivost sa 9
				
				System.out.print(i + " "); // ako je djeljivo sa 9 ispisujemo broj
				
			}
		}

	}

}
