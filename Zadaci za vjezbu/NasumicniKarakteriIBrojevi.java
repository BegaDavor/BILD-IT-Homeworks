package src;

public class NasumicniKarakteriIBrojevi {
	public static char randomKarakter() {
		return (char)('A' + Math.random() * ('Z' - 'A' + 1));
		 }
	
	public static char randomBroj() {
		return (char)('0' + Math.random() * ('9' - '0' + 1));
		 }
	public static void main(String[] args) {
		int i, j = 0;
		for (i = 1; i<=100; i++) {
			j++;
			if (j%10 == 0) {
				System.out.println(randomKarakter());
			}else {
				System.out.print(randomKarakter() + " ");
				if (j%10 == 0) {
					System.out.println(randomBroj());
				}else {
					System.out.print(randomBroj() + " ");
				}
			}
			
		
	}

}
}
