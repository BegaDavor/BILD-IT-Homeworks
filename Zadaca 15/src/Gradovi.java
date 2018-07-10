package src;

import java.util.Scanner;

public class Gradovi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // skener
		System.out.println("Unesite ime prvog grada: "); // unos gradova
		String grad1 = input.nextLine();
		System.out.println("Unesite ime drugog grada: ");
		String grad2 = input.nextLine();
		System.out.println("Unesite ime treceg grada: ");
		String grad3 = input.nextLine();
		for (int i = 0; i < grad1.length();){ // petlja za grad1
			for (int j = 0; j < grad2.length();){ // petlja za grad2
				for (int k = 0; k < grad3.length();){ // petlja za grad3
					if (grad1.charAt(i) <= grad2.charAt(j) && grad2.charAt(j) <= grad3.charAt(k)){ // ispitujemo abecedni red prvih slova
						if (grad1.charAt(i) == grad2.charAt(j)){ // ako su prva slova jednaka gledamo dalje slova
							i++;
							j++;
						}
						if (grad1.charAt(i) == grad3.charAt(k)){
							i++;
							k++;
						}
						if (grad2.charAt(j) == grad3.charAt(k)){
							j++;
							k++;
						}
						System.out.println(grad1 + " " + grad2 + " " + grad3);
						break;
					}else if (grad1.charAt(i) <= grad3.charAt(k) && grad3.charAt(k) <= grad2.charAt(j)){
						if (grad1.charAt(i) == grad2.charAt(j)){
							i++;
							j++;
						}
						if (grad1.charAt(i) == grad3.charAt(k)){
							i++;
							k++;
						}
						if (grad2.charAt(j) == grad3.charAt(k)){
							j++;
							k++;
						}
						System.out.println(grad1 + " " + grad3 + " " + grad2);
						break;
					}else if (grad2.charAt(j) <= grad1.charAt(i) && grad1.charAt(i) <= grad3.charAt(j)){
						if (grad1.charAt(i) == grad2.charAt(j)){
							i++;
							j++;
						}
						if (grad1.charAt(i) == grad3.charAt(k)){
							i++;
							k++;
						}
						if (grad2.charAt(j) == grad3.charAt(k)){
							j++;
							k++;
						}
						System.out.println(grad2 + " " + grad1 + " " + grad3);
						break;
					}else if (grad2.charAt(j) <= grad3.charAt(k) && grad3.charAt(k) <= grad1.charAt(i)){
						if (grad1.charAt(i) == grad2.charAt(j)){
							i++;
							j++;
						}
						if (grad1.charAt(i) == grad3.charAt(k)){
							i++;
							k++;
						}
						if (grad2.charAt(j) == grad3.charAt(k)){
							j++;
							k++;
						}
						System.out.println(grad2 + " " + grad3 + " " + grad1);
						break;
					}else if (grad3.charAt(k) <= grad1.charAt(i) && grad1.charAt(i) <= grad2.charAt(j)){
						if (grad1.charAt(i) == grad2.charAt(j)){
							i++;
							j++;
						}
						if (grad1.charAt(i) == grad3.charAt(k)){
							i++;
							k++;
						}
						if (grad2.charAt(j) == grad3.charAt(k)){
							j++;
							k++;
						}
						System.out.println(grad3 + " " + grad1 + " " + grad2);
						break;
					}else if (grad3.charAt(k) <= grad2.charAt(j) && grad2.charAt(j) <= grad1.charAt(i)){
						if (grad1.charAt(i) == grad2.charAt(j)){
							i++;
							j++;
						}
						if (grad1.charAt(i) == grad3.charAt(k)){
							i++;
							k++;
						}
						if (grad2.charAt(j) == grad3.charAt(k)){
							j++;
							k++;
						}
						System.out.println(grad3 + " " + grad2 + " " + grad1);
						break;
					}
					break;
					
				}
				break;
			}
			break;
		}
	
		input.close();
	}

}
