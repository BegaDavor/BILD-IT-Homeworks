package src;

public class ProstiBrojevi {
	public static boolean isProstiBroj(int broj){ // metoda koja ispituje da li je boj prost
		if (broj == 1 || broj == 0){
			return false;
		}else if (broj == 2 || broj == 3 || broj == 5 || broj == 7){
			return true;
		}else {
			while (broj % 2 == 0 || broj % 3 == 0 || broj % 5 == 0 || broj % 7 == 0 || broj % 3 == 0 && broj % 5 == 0 ||broj % 5 == 0 && broj % 7 == 0 || broj % 3 == 0 && broj % 7 == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i <= 100000; i++){ // prolazak kroz brojeve od 1 do 100 000
			if (isProstiBroj(i) == true){ // ispis prostih brojeva od 1 do 100 000 deset po redu
				j++;
				if (j%10 == 0) {
					System.out.println(i);
				}else {
					System.out.print(i + " ");
				}
			}
		}

	}

}
