
public class PetlaDoWhile {

	public static void main(String[] args) {
		int licznik = 0;
		do {
			System.out.println("wykonano instrukcj� " + licznik + " razy");
			licznik++;
		}
		while (licznik < 5);
		System.out.println("koniec pierwszej p�tli");
		int licznik2 = 10;
		do {
			System.out.println("wykonano instrukcj� " + licznik2 + " razy");
			licznik2++;
		}
		while (licznik2 < 5);		
		System.out.println("koniec drugiej p�tli");
	}

}
