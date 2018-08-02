package src;

public class KnjgeTest {

	public static void main(String[] args) {
		
		// kreiranje objekata
		
		Knjige knjiga1 = new Knjige("Kada svinje polete", "Mark Blejk", 2017);
		Knjige knjiga2 = new Knjige("Buducnost je vec pocela", "Robert Jungk", 1958);
		Knjige knjiga3 = new Knjige("Kako uskladiti tijelo i um", "Osho Rajneesh", 2016);
		
		
		
		knjiga1.informacije();
		System.out.println();
		knjiga2.informacije();
		System.out.println();
		knjiga3.informacije();
		System.out.println();
		
		System.out.println("Broj knjiga: " + Knjige.getBrojKreiranihObjekata());

	}

}
