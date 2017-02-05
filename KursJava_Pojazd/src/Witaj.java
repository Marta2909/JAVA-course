import java.util.Scanner;

public class Witaj {

	public static void main(String[] args) {
		String imie;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Jak masz na imiê?");
		imie = odczyt.nextLine();
		
		System.out.println("Witaj " + imie + "\n" + "Jak d³ugo uczysz siê Javy?");
		int dni = odczyt.nextInt();
		if (dni < 5) {
			System.out.println("Jesteœ na poziomie podstawowym");
		} else {
			System.out.println("Przypominasz sobie Javê");
		}
	}

}
