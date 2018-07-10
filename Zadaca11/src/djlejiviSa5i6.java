package src;

public class djlejiviSa5i6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 100; i <= 1000; i++){
			if (i % 5 == 0 && i % 6 == 0){
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
