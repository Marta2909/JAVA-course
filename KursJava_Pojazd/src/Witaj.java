import java.util.Scanner;

public class Witaj {

	public static void main(String[] args) {
		String imie;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Jak masz na imi�?");
		imie = odczyt.nextLine();
		
		System.out.println("Witaj " + imie + "\n" + "Jak d�ugo uczysz si� Javy?");
		int dni = odczyt.nextInt();
		if (dni < 5) {
			System.out.println("Jeste� na poziomie podstawowym");
		} else {
			System.out.println("Przypominasz sobie Jav�");
		}
	}

}
