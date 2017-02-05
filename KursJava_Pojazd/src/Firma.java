
public class Firma {

	public static void main(String[] args) {
		Pracownik pracownik = new Pracownik("Jan", "Kowalski", 3000);
		System.out.println("Imiê: " + pracownik.imie);
		System.out.println("Nazwisko: " + pracownik.nazwisko);
		System.out.println("Wyp³ata: " + pracownik.wyp³ata);

		Szef szef = new Szef();
		szef.imie = "Franciszek";
		szef.nazwisko = "Nowak";
		szef.wyp³ata = 3000;
		System.out.println("Imiê szefa: " + szef.imie);
		System.out.println("Nazwisko szefa: " + szef.nazwisko);
		System.out.println("Wyp³ata szefa: "+ szef.wyp³ata);
		
		Samochod samochod = new Samochod();
		System.out.println(samochod.KIEROWCA);
	}

}
