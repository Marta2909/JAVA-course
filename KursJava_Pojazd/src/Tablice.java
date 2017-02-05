import java.util.Arrays;

public class Tablice {

	public static void main(String[] args) {
		int[] tablica = new int[10];
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = i * 3;
		}
		for (int i : tablica) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Object[] tablicaObiektow = {new Object(), new Object(), new Object()};
		System.out.println(tablicaObiektow.length);
		
		
		int[] nowaTablica = new int[10];
		nowaTablica[0] = 5;
		nowaTablica[1] = 12;
		nowaTablica[2] = 3;
		nowaTablica[3] = 8;
		nowaTablica[4] = 19;
		nowaTablica[5] = 4;
		
		for (int i : nowaTablica) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(nowaTablica);
		
		for (int i : nowaTablica) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.binarySearch(nowaTablica, 8));
		
	}

}
