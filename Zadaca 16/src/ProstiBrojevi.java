package src;

public class ProstiBrojevi {
	public static boolean isPrime(int num){ // metoda koja provjerava da li je broj prost
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
	public static void main(String[] args) {
		System.out.println("Prosti brojevi od 2 do 1000 su: ");
		int j = 0;
		for (int i = 2; i <= 1000; i++){ // prolazimo kroz brojeve od 2 do 1000
			if (isPrime(i) == true){ //ispitujemo pomocu metode da li je broj prost
				j++;
				if (j%8 == 0) { // ako je osmi u redu ispisujemo i prebacujemo u novi red
					System.out.println(i);
				}else {
					System.out.print(i + " "); // ako nije pisemo u istom redu i pravimo razmak
				}
			}
		}

	}

}
