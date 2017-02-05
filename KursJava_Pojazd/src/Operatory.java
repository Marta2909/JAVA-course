
public class Operatory {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a *= 10;
		System.out.println(a);
		a /= b;
		System.out.println(a);
		a %= b;
		System.out.println(a);
		boolean c = true;
		boolean d = false;
		c &= d;
		System.out.println(c);
		c |= d;
		System.out.println(c);
		
		TabliceWielowymiarowe doZmiennejGl = new TabliceWielowymiarowe();
		doZmiennejGl.zmienna = 6;
		doZmiennejGl.wyswietl();
		
	}

}
