package src;



public class Karte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int broj = (int) (1 + Math.random()*14);
		int znak = (int) (5 + Math.random()*10)%4;
		String znak1 = "";
		switch (znak) {
		case 0 : znak1 = "srca"; break;
		case 1 : znak1 = "pika"; break;
		case 2 : znak1 = "djeteline"; break;
		case 3 : znak1 = "kocke"; 
		}
		if (broj == 1 || broj == 11){
			System.out.println("Karta koju ste izvukli je A u znaku " + znak1 + ".");
		}else if (broj == 12){
			System.out.println("Karta koju ste izvukli je J u znaku " + znak1 + ".");
		}else if (broj == 13){
			System.out.println("Karta koju ste izvukli je Q u znaku " + znak1 + ".");
		}else if (broj == 14){
			System.out.println("Karta koju ste izvukli je K u znaku " + znak1 + ".");
		}else {
			System.out.println("Karta koju ste izvukli je " + broj + " u znaku " + znak1 + ".");
		}
		

	}
}
