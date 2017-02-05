import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Odczyt {

	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 4, 5};
		Scanner odczyt = new Scanner(System.in);
		int index = -1;
		System.out.println("Podaj indeks tablicy, kt�ry chcesz zobaczy�");
		try {
			index = odczyt.nextInt();
			System.out.println(tab[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Przekroczono rozmiar tablicy. Rozmiar tablicy to " + (tab.length-1));
		} 
		catch(InputMismatchException e2){
			System.out.println("Wprowadz cyfre od 0 do 4");
		}
		
		BufferedReader odczyt2 = new BufferedReader(new InputStreamReader(System.in));
		int index2 = -1;
		System.out.println("Kt�ry element tablicy chcesz wy�wietli�?");
		boolean czyPoprawne = false;
		while (!czyPoprawne) {
			try{
				index2 = Integer.parseInt(odczyt2.readLine());
				System.out.println(tab[index2]);
			}
			catch(NumberFormatException n){
				System.out.println("Niepoprawne dane" + "\n Kt�ry element wy�wietli�?");
			} 
			catch (IOException e) {
				System.out.println("B��d danych");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Przekroczono rozmiar tablicy." + "\n Kt�ry element wy�wietli�?");
			}
			czyPoprawne = (index2 == -1 || index2 > 4) ? false : true;
		}
	}

}
