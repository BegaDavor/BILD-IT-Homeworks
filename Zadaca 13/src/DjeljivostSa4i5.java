package src;

public class DjeljivostSa4i5 {

	public static void main(String[] args) {
		System.out.println("Brojevi koji su djeljiva sa 4, ali ne sa 5 u rasponu od 1 do 1000 su: ");
		for (int i = 1; i <= 1000; i++){ // petlja koja prolazi brojevima od 1 do 1000 i ispituje da li vrijedi uslov zadatka
			if (i % 4 == 0 && i % 5 != 0){
				System.out.println(i);
			}
		}

	}

}
