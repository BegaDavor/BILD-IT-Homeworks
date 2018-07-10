package src;

public class ZbirRazlomaka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double suma = 0;
		for (i = 1 ; i <= 49; i++){
			suma += (double) (2*i - 1)/ (double) (2*i + 1);
		}
		System.out.println("Suma je: " + suma);
		
	}

}
