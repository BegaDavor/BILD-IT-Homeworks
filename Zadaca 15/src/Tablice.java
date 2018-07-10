package src;

public class Tablice {

	public static void main(String[] args) {
		char prvoSlovo = (char) ('A' + Math.random() * ('Z' - 'A' + 1)); 
		char drugoSlovo = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
		char treceSlovo = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
		int broj = (int) (1000 + Math.random()*(9999 - 1000 + 1));
		System.out.println("Broj vasih tablica je: " + prvoSlovo + drugoSlovo + treceSlovo + " - " + broj);
	}

}
