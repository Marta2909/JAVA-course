import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pliki {

	public static void main(String[] args) throws FileNotFoundException {
		File plik = new File("M:\\GIT\\KursJava_Pojazd\\plik.txt");
		System.out.println(plik.length());
		System.out.println(plik.getFreeSpace());
		System.out.println(plik.canRead());
		System.out.println(plik.canWrite());
		
		Scanner odczyt = new Scanner(plik);
		
		if(plik.length() > 0) {
			while (odczyt.hasNextLine()){
				String tekst = odczyt.nextLine();
				System.out.println(tekst);
			}
		} else {
			System.out.println("Ups, plik jest pusty");
		}
		
		System.out.println(plik.length());
		if (plik.length() != 0) {
			PrintWriter zapis = new PrintWriter("M:\\GIT\\KursJava_Pojazd\\plik.txt");
			System.out.println("Plik nie jest pusty. Nadpisaæ? (t/n)");
			Scanner user = new Scanner(System.in);
			if (user.nextLine().equals("t")){
				zapis.println("nowy zapis nadpisany");
				zapis.close();
				System.out.println("Plik nadpisany");
			} else {
				System.out.println("Plik nie mo¿e zostaæ nadpisany");
			}
		} else {
			PrintWriter zapis = new PrintWriter("M:\\GIT\\KursJava_Pojazd\\plik.txt");
			zapis.println("Mój pierwszy zapis do pliku tekstowego");
			zapis.close();		
			System.out.println("Plik by³ pusty. Zapisano.");
		}

	}

}
