package src;

public class Knjige {
	
	// atributi
	
	String naslov;
	String autor;
	int godinaIzdavanja;
	
	// klasna varijabla
	private static int brojKreiranihObjekata = 0;
	
	// konstruktori
	
	public Knjige() {
		brojKreiranihObjekata++;
	}
	
	public Knjige(String naslov, String autor, int godinaIzdavanja) {
		
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdavanja = godinaIzdavanja;
		brojKreiranihObjekata++;
	}
	
	// ponasanje
	
	public void informacije() {
		System.out.println("Naslov: " + naslov);
		System.out.println("Autor: " + autor);
		System.out.println("Godina izdavanja: " + godinaIzdavanja);
	}
	
	public static int getBrojKreiranihObjekata() {
		return brojKreiranihObjekata;
	}

}
