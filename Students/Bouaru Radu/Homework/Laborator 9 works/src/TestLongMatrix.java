
public class TestLongMatrix {
	public static void main(String[] args) {
		Long[][] m1 = new Long[][] { { (long) 1e6, (long) 1e6 }, { (long) 1e6, (long) 1e6 } };
		Long[][] m2 = new Long[][] { { (long) 1e7, (long) 1e8 }, { (long) 1e9, (long) 1e5 } };

		LongMatrix longMatrix = new LongMatrix();
		System.out.println("\nm1 + m2 is");
		GenericMatrix.printResult(m1, m2, longMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is");
		GenericMatrix.printResult(m1, m2, longMatrix.multiplyMatrix(m1, m2), '*');
	}
}
