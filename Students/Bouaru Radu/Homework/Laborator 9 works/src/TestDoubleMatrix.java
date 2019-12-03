
public class TestDoubleMatrix {
	public static void main(String[] args) {
		Double[][] m1 = new Double[][] { { 1.2, 2.3, 3.5 }, { 4.5, 5.0, 6.7 }, { 1.2, 1.3, 1.4 } };
		Double[][] m2 = new Double[][] { { 1.2, 1.6, 1.7 }, { 2.3, 2.95, 2.5 }, { 1.0, 1.0, 1.0 } };

		DoubleMatrix doubleMatrix = new DoubleMatrix();
		System.out.println("\nm1 + m2 is");
		GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');
		
		System.out.println("\nm1 * m2 is");
		GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
	}
}
