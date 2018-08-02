package src;

public class Student {
	
	// stanja
	private String ime;
	private String prezime;
	private char pol;
	private int godine;
	private String brojIndeksa;
	
	// no-arg konstruktor
	public Student(){
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public char getPol() {
		return pol;
	}

	public void setPol(char pol) {
		this.pol = pol;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	
	

}
