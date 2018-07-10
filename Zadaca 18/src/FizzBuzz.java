package src;

public class FizzBuzz {
	public static void fizzBuzz(int broj) { //metoda koja ispituje da li je fizz, buzz ili fizzbuzz
		if (broj % 3 == 0 && broj % 5 != 0){
			System.out.println("Fizz");
		}else if (broj % 5 == 0 && broj % 3 != 0){
			System.out.println("Buzz");
		}else if (broj % 3 == 0 && broj % 5 == 0){
			System.out.println("FizzBuzz");
		}else {
			System.out.println(broj);
		}
	}

	public static void main(String[] args) {
		System.out.println("Fizz ili Buzz ili FizzBuzz: "); // ispis uslova zadatka za brojeve od 1 do 100
		for (int i = 1; i <= 100; i++) {
			
			fizzBuzz(i);
			
			
		}

	}

}
