
public class Przerywanie {

	public static void main(String[] args) {
		int[] tablica = new int[10];
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = i;
		}
		
		for (int i : tablica) {
			if (i == 5){
				break;
			}
			System.out.println(i);
		}
		
		System.out.println(" ");
		int i = 0;
		while (true){
			if (i == 15) break;
			System.out.println(i);
			i++;
		}
		
		System.out.println(" ");
		
		for (int j = 0; j < tablica.length; j++) {
			if (j == 5 || j > 7){
				continue;
			}
			System.out.println(tablica[j]);
		}
		
		System.out.println(" ");
		int k = 0;
		while (k < 21){
			k++;
			if (k >= 10 && k <= 15){
				continue;
			}
			System.out.println(k);
		}
	}

}
