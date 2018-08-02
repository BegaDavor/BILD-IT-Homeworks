package src;

public class SamsungJ52016 {
	
	// stanja
	
	private int memorija = 16;
	private int RAM = 4;
	String verzijaAndroida = "7.1.1";
	boolean SDKartica = false;
	int memorijaSDKartice;
	
	//no-arg konstruktor
	
	public SamsungJ52016() {
		
	}

	public int getMemorija() {
		return memorija;
	}


	public int getRAM() {
		return RAM;
	}


	public String getVerzijaAndroida() {
		return verzijaAndroida;
	}

	public void setVerzijaAndroida(String verzijaAndroida) {
		this.verzijaAndroida = verzijaAndroida;
	}

	public boolean isSDKartica() {
		return SDKartica;
	}

	public void setSDKartica(int memorijaSDKartice) {
		SDKartica = true;
		this.memorijaSDKartice = memorijaSDKartice;
	}

	public int getMemorijaSDKartice() {
		return memorijaSDKartice;
	}

	public void setMemorijaSDKartice(int memorijaSDKartice) {
		if(SDKartica)
		this.memorijaSDKartice = memorijaSDKartice;
	}
	

}
