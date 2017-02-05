
public class UstawDane {

	public static void main(String[] args) {	
		Dane dane = new Dane();
		//dane.setImie("Janek");
		dane.setWiek(18);
		Dane dane2 = new Dane("Jarek");
		Dane dane3 = new Dane("Piotrek", 6);
		System.out.println("Imiê to " + dane.getImie() + ", a wiek to " + dane.getWiek());
		System.out.println("Imiê to " + dane2.getImie() + ", a wiek to " + dane2.getWiek());
		System.out.println("Imiê to " + dane3.getImie() + ", a wiek to " + dane3.getWiek());
	}

}
