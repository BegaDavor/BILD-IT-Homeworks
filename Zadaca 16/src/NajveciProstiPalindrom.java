package src;

public class NajveciProstiPalindrom {
	public static boolean isPalindrom (int broj){ // metoda koja provjerava da li je broj palindrom
		boolean palindrom = false;
		
			int jedinice = broj % 10;
			int stotice = (broj/10)/10;
			if (jedinice == stotice){
				palindrom = true;
			}else {
				palindrom = false;
			}
			return palindrom;
		}
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
		System.out.println("Najveci prosti palindrom manji od 1000 je: ");
		int broj = 1000;
		while (broj != 100){ // prolazimo kroz brojeve od 1000 do 100
		if (isPalindrom(broj) == true && isPrime(broj) == true){ // ako je broj i palindrom i prost
			System.out.println(broj); // ispisujemo broj
			break; // zaustavoljamo 
		}else {broj--;} // ako nije smanjujemo broj za 1
		}
		

	}

}
