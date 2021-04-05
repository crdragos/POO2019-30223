import java.util.Scanner;

public class SumOfMultiples {
	static long gauss(long n) {
		return n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		// Folosim principiul inlcuderii si al excluderii

		/*
		 * Pt. multiplii de 3: 3n < 1000 n = round(1000/3) sum (i=1 to n) 3i =
		 * 3*i(i+1)/2 analog pentru multiplii de 5 si 15
		 */
		long n, sumMul3, sumMul5, sumMul15, sumFinal;
		Scanner s = new Scanner(System.in);
		n = s.nextLong();

		sumMul3 = 3 * gauss(n / 3);
		sumMul5 = 5 * gauss(n / 5 - 1);
		sumMul15 = 15 * gauss(n / 15);

		sumFinal = sumMul3 + sumMul5 - sumMul15;
		System.out.println(sumFinal);
	}

}
