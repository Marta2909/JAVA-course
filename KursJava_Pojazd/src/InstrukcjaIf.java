
public class InstrukcjaIf {

	public static void main(String[] args) {
		int i = 5;
		if (i > 3) {
			System.out.println("i jest wiêksze od 3");
		}
		if (i > 6){
			System.out.println("i jest wiêksze od 6");
		}
		int b = 5;
		if (b == 6) {
			System.out.println("b jest równe 5");
		} else {
			System.out.println("b jest ró¿ne od 5");
		}
		
		if (b < 5){
			System.out.println("B jest mniejsze od 5");
		}
		else if (b>=5 && b < 7){
			System.out.println("B jest wiêksze lub równe 5 i mniejsze od 7");
		}
		else if (b >= 7){
			System.out.println("B jest wiêksze lub równe 7");
		}
	}

}
