
public class Switch {

	public static void main(String[] args) {
		int ocena = 1;
		switch (ocena) {
		case 1:
		case 2:
			System.out.println("musisz siê poprawiæ");
			break;
		case 3:
			System.out.println("nie jest ¿le");
			break;
		case 4: 
			System.out.println("ca³kiem dobrze");
			break;
		case 5:
			System.out.println("bardzo dobrze!");
			break;
		case 6:
			System.out.println("Genialnie!!!");
			break;
		default:
			System.out.println("Poda³eœ z³¹ wartoœæ. Popraw!");
		}

	}

}
