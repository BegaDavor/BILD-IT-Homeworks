package src;

public class SortedNumbers {
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		if (num1 < num2 && num2 < num3){
			System.out.println("Sortirani brojevi su: " + num1 + " " + num2 + " " + num3);
		}else if (num1 < num3 && num3 < num2){
			System.out.println("Sortirani brojevi su: " + num1 + " " + num3 + " " + num2);
		}else if (num2 < num1 && num1 < num3){
			System.out.println("Sortirani brojevi su: " + num2 + " " + num1 + " " + num3);
		}else if (num2 < num3 && num3 < num1){
			System.out.println("Sortirani brojevi su: " + num2 + " " + num3 + " " + num1);
		}else if (num3 < num1 && num1 < num2){
			System.out.println("Sortirani brojevi su: " + num3 + " " + num1 + " " + num2);
		}else if (num3 < num2 && num2 < num1){
			System.out.println("Sortirani brojevi su: " + num3 + " " + num2 + " " + num1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displaySortedNumbers(2.0, 3.4, 1.1);

	}

}
