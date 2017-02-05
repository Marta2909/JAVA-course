
public abstract class WlasciwosciPojazdu {
	public void nieZaSzybko(int predkosc, int predkoscMax){
		if(predkosc*2 == predkoscMax){
			System.out.println("Nie jedziesz za szybko?");
		}
	}
	public abstract void skrec(int kat);
}
