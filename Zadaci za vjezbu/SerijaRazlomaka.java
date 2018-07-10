package src;

public class SerijaRazlomaka {
	public static double m(int i){
		double m = 0;
		for (int j = 0; j <= i; j++ ){
			m +=((double)j/(double)(j+1)); 
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i\t\tm(i)");
		System.out.println("--------------------------");
		for (int i = 1; i <= 20; i++){
			System.out.println(i + "\t" + m(i));
		}

	}

}
