
public class Firma {

	public static void main(String[] args) {
		Pracownik pracownik = new Pracownik("Jan", "Kowalski", 3000);
		System.out.println("Imi�: " + pracownik.imie);
		System.out.println("Nazwisko: " + pracownik.nazwisko);
		System.out.println("Wyp�ata: " + pracownik.wyp�ata);

		Szef szef = new Szef();
		szef.imie = "Franciszek";
		szef.nazwisko = "Nowak";
		szef.wyp�ata = 3000;
		System.out.println("Imi� szefa: " + szef.imie);
		System.out.println("Nazwisko szefa: " + szef.nazwisko);
		System.out.println("Wyp�ata szefa: "+ szef.wyp�ata);
		
		Samochod samochod = new Samochod();
		System.out.println(samochod.KIEROWCA);
	}

}
