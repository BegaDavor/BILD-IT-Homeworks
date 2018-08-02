package src;

public class SamsungJ52016Test {
	public static void main(String[] args) {
		SamsungJ52016 noviMobitel = new SamsungJ52016();
		System.out.println("Memorija mobitela je: " + noviMobitel.getMemorija());
		System.out.println("RAM mobitela je: " + noviMobitel.getRAM());
		System.out.println("Verzija androida je: " + noviMobitel.getVerzijaAndroida());
		System.out.println("Mobitel ima SD karticu: " + noviMobitel.SDKartica);
		
		// postavljanje SD kartica i provjera memorije
		System.out.println();
		System.out.println("Kada umetnemo SD karticu");
		
		noviMobitel.setSDKartica(8);
		
		System.out.println("Mobitel ima SD karticu: " + noviMobitel.SDKartica);
		System.out.println("Memorija SD kartice je: " + noviMobitel.getMemorijaSDKartice());
	}

}
