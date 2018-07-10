package src;

public class PrimeNumbers {
	public static boolean isPrime(int num){
		if (num == 1){
			return false;
		}else if (num == 2 || num == 3 || num == 5 || num == 7){
			return true;
		}else {
			while (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 3 == 0 && num % 5 == 0 ||num % 5 == 0 && num % 7 == 0 || num % 3 == 0 && num % 7 == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 1; i <= 10000; i++){
			if (isPrime(i) == true){
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
