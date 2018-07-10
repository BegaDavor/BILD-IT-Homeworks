package src;

public class TwinPrime {
	public static boolean isPrime(int num){ //metoda koja ispituje da li je broj prost
		if (num == 1){
			return false;
		}else if (num == 2 || num == 3 || num == 5 || num == 7){
			return true;
		}else {
			while (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 3 == 0 && num % 5 == 0 ||num % 5 == 0 && num % 7 == 0 || num % 3 == 0 && num % 7 == 0 || num % Math.sqrt(num) == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isTwinPrime(int broj) { // metoda koja ispituje da li je broj twin prime
		boolean twin = false;
			if (isPrime(broj) == true && isPrime(broj + 2) == true){
				twin= true;
			
		}
		return twin;
	}

	public static void main(String[] args) {
		System.out.println("Twin Prime brojevi manji od 10 000 su: ");
		int j = 0;
		for (int i = 1; i < 10000; i ++ ) { //prolazak kroz brojeve manje od 10 000
			if (isTwinPrime(i) == true){ // poziv metode twin prime i ako broj jeste twin prime ispisuje njega i njegov par
				j++;
				if (j%10 == 0) {
					System.out.print(i + " i ");
					System.out.println((i+2) + ", ");
				}else {
					System.out.print(i + " i " + (i+2) + ", ");
				}
			}
		}

	}

}
