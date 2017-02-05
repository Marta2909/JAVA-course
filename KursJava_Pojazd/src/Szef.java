
public class Szef extends Pracownik {
	int premia;
	
	public Szef(){}
	
	public Szef(int premia) {
		this.premia = premia;
	}
	
	public Szef(String imie, String nazwisko, int wyp³ata, int premia){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wyp³ata = wyp³ata;
		this.premia = premia;
	}
}
