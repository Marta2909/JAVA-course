
public class PetlaForEach {

	public static void main(String[] args) {
		int[] tablica = new int[20];
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = i * 3;
		}

		for (int element_tablicy : tablica) {
			System.out.print(element_tablicy + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < tablica.length; i+=3) {
			int j = tablica[i];
			System.out.println("Element tablicy to " + j + ", a jego pierwiastek to " + Math.sqrt(j));
		}
		
		for (int i = tablica.length-1; i >= 0; i--) {
			int j = tablica[i];
			System.out.print (j + " ");
		}
	}

}
