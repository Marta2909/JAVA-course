import java.math.BigInteger;

public class WielkieLiczby {

	public static void main(String[] args) {
		System.out.println(BigInteger.ONE);
		BigInteger wielkaLiczba = new BigInteger("12334222577424724272");
		System.out.println(wielkaLiczba);
		BigInteger wielkaLiczba2 = BigInteger.valueOf(1234486857);
		System.out.println(wielkaLiczba2);
		BigInteger suma = wielkaLiczba.add(wielkaLiczba2);
		System.out.println("suma: " + suma.toString());
		BigInteger wielkaDoPotegi10 = wielkaLiczba.pow(10);
		System.out.println(wielkaDoPotegi10);
		System.out.println(wielkaDoPotegi10.toString().length());
		System.out.println(wielkaDoPotegi10.divide(wielkaLiczba2));
		
		TabliceWielowymiarowe obiektDoStalej = new TabliceWielowymiarowe();
		System.out.println("Sta³a to: " + obiektDoStalej.NAZWA);
	}

}
