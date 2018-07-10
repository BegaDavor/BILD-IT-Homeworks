package src;

public class DjeljivostSaBrojevimaDo20 {

	public static void main(String[] args) {
		int broj = 1;
		
			for (int i = 1; i <= 20;)
			if (broj % i == 0){
				i++;
			}else {
				broj ++;
				i = 1;
			}
		System.out.println("Broj koji je djeljiv sa svim brojevima od 1 do 20 je: " + broj);
	}
}
