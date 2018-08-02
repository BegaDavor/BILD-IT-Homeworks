package src;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student noviStudent = new Student();
		
		noviStudent.setBrojIndeksa("16/2015");
		noviStudent.setIme("Zgembo");
		noviStudent.setPrezime("Adislic");
		noviStudent.setGodine(25);
		noviStudent.setPol('M');
		
		Student noviStudent1 = new Student();
		
		noviStudent1.setBrojIndeksa("VIII-25-E/2015");
		noviStudent1.setIme("Alen");
		noviStudent1.setPrezime("Oprosti");
		noviStudent1.setGodine(24);
		noviStudent1.setPol('M');
		
		System.out.println("Ime: " + noviStudent.getIme());
		System.out.println("Prezime: " + noviStudent.getPrezime());
		System.out.println("Br. indexa: " + noviStudent.getBrojIndeksa());
		System.out.println("Godine: " + noviStudent.getGodine());
		System.out.println("Spol: " + noviStudent.getPol());
		System.out.println();
		System.out.println("Ime: " + noviStudent1.getIme());
		System.out.println("Prezime: " + noviStudent1.getPrezime());
		System.out.println("Br. indexa: " + noviStudent1.getBrojIndeksa());
		System.out.println("Godine: " + noviStudent1.getGodine());
		System.out.println("Spol: " + noviStudent1.getPol());
	}

}
