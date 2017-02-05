
public class Dane {
	
	public Dane() {
		imie = "Marek";
	}
	
	public Dane(String imie){
		this.imie = imie;
		wiek = 22;
	}
	
	public Dane(String imie, int wiek){
		this.imie = imie;
		this.wiek = wiek;
	}
	
	private String imie;
	private int wiek;
	
	public void setImie(String i){
		this.imie = i;
	}
	
	public void setWiek(int w){
		this.wiek = w;
	}
	
	public String getImie(){
		return imie;
	}
	
	public int getWiek(){
		return wiek;
	}
	
	public void wyswietlWiek(){
		System.out.println(wiek);
	}
	
	public int sumaLiczb(int a, int b, int c){
		return a+b+c;
	}
	
	public double sumaLiczb(byte a, int b, double c){
		return a+b+c;
	}
	
	void wyswietlLiczbe(int liczba){
		liczba++;
		System.out.println(liczba);
	}
}
