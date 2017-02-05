import java.awt.Button;

public class Pojazd {
	
	String czyJedzie(){
		return "Pojazd jedzie";
	}
	
	String jakJedzie(String text){
		return text;
	}

	public static void main(String[] args) {
		Pojazd samochod = new Pojazd();
		Pojazd motocykl = new Pojazd();
		System.out.println(samochod.czyJedzie() + samochod.jakJedzie(" wolno"));
		System.out.println(motocykl.jakJedzie("szybko"));
		int i;
		i = 10;
		int j = 10;
		String imie = "Jan";
		char a = 'a';
		byte b = 10;
		boolean p = true;
		int c = 1000;
		short d = 100;
		long g = 110L;
		float f = (float) 1.1;
		double db = 10.805;
		String s;
		Button bu;
		int[] tablica;
		tablica = new int[10];
		tablica[0] = 5;
		tablica[1] = 15;
		tablica[2] = 25;
		int[] nowaTablica = {1,3,6,9};
		String[] imiona = new String[5];
		imiona[0] = "Jan";
		imiona[1] = "Tomek";
		imiona[2] = "Patryk";
		imiona[3] = "Wojtek";
		System.out.println(imiona[2]);
		
	}

}
