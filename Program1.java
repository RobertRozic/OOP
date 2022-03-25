import klase.Osoba;

class Program1 {
	
	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		Osoba o2 = new Osoba();
		
		o1.ime = "Ivan";
		o1.prezime = "Ivic";
		
		o2.ime = "Ana";
		o2.prezime = "Anic";
		
		System.out.println(o2.ime);
	}
}