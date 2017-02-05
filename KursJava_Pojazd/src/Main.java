
public class Main {

	public static void main(String[] args) {
		
		String str1 = new String("Przyk³adowy String 1");
		Object str2 = new String("Przyk³adowy string 2");
		System.out.println(str1);
		System.out.println(str2);
		
		Dane dane = new Dane();
		dane.setWiek(5);
		System.out.println("Wiek z klasy Dane: " + dane.getWiek());
		
		Test test = new Test();
		test.zmien(dane);
		System.out.println("Wiek z klady Dane teraz: " + dane.getWiek());
		
		System.out.println("5 + 4 = " + dodaj(5,4));
		System.out.println("10 + 4 + 6 = " + dodaj(10,4,6));
		System.out.println("8.3 + 4.5 = " + dodaj(8.3,4.5));
		System.out.println("Suma liczb = " + dodaj_liczby(1, 4, 5, 30, 56, 421));

		imiona();
		imiona("Janek", "Franek");
	}
	
	static int dodaj(int a, int b){
		return a+b;
	}
	
	static int dodaj(int a, int b, int c){
		return a+b+c;
	}
	
	static double dodaj(double a, double b){
		return a+b;
	}
	
	static int dodaj_liczby(int...lista){
		int wynik = 0;
		for (int i = 0; i < lista.length; i++) {
			wynik += lista[i];
		}
		return wynik;
	}
	
	static void imiona(String...imiona){
		if (imiona.length > 0) {
			for (int i = 0; i < imiona.length; i++) {
				System.out.println(imiona[i]);
			}
		} else {
			System.out.println("Nie ma ¿adnego imienia");
		}
	}
		
}

