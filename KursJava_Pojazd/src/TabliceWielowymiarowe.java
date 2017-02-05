
public class TabliceWielowymiarowe {
	final static int LICZBA = 7;
	final String NAZWA = "ECLIPSE";
	int zmienna;
	String lancuch;
	char znak;
	
	public void wyswietl(){
		System.out.println("Zmienna to: " + zmienna);
	}
	public void wyswietlTekst(){
		System.out.println("Tekst to: " + lancuch);
	}
	public void wyswietlZnak(){
		System.out.println("Znak to: " + znak);
	}
	
	public void wyswietlLiczbe(){
		int mojaLiczba = 100;
		System.out.println("Moja liczba to " + mojaLiczba);
	}
	
	public static void main(String[] args) {
		int[][] tablica = new int[3][3];

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				tablica[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				System.out.print(tablica[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("Tablica asymetryczna:");
		
		int[][] tablicaAsymetryczna = new int[5][];
		tablicaAsymetryczna[0] = new int[5];
		tablicaAsymetryczna[1] = new int[4];
		tablicaAsymetryczna[2] = new int[3];
		tablicaAsymetryczna[3] = new int[2];
		tablicaAsymetryczna[4] = new int[1];
		
		for (int i = 0; i < tablicaAsymetryczna.length; i++) {
			for (int j = 0; j < tablicaAsymetryczna[i].length; j++) {
				tablicaAsymetryczna[i][j] = (int)(Math.random()*10);
			}
		}
		
		for (int i = 0; i < tablicaAsymetryczna.length; i++) {
			for (int j = 0; j < tablicaAsymetryczna[i].length; j++) {
				System.out.print(tablicaAsymetryczna[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Zmienna globalna:");
		TabliceWielowymiarowe doZmiennejGlobalnej = new TabliceWielowymiarowe();
		doZmiennejGlobalnej.wyswietl();
		doZmiennejGlobalnej.wyswietlTekst();
		doZmiennejGlobalnej.wyswietlZnak();
		doZmiennejGlobalnej.wyswietlLiczbe();
		System.out.println("Wartoœæ sta³ej to " + LICZBA);
 	}


}
