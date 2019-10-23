import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws FileNotFoundException {
	int[] x;
		int[] y;
		int x_size = 0;
		int y_size = 0;
		File file = new File("C:\\Users\\r_rad\\eclipse-workspace\\Assignments 2\\src\\pol.txt");
		Scanner sc = new Scanner(file);
		String coefPoly1 = sc.nextLine();
		String coefPoly2 = sc.nextLine();

		String[] tokens = coefPoly1.split(" ");
		for (String i : tokens)
			x_size++;
		x = new int[x_size];
		int k = 0;
		for (String i : tokens)
			x[k++] = Integer.parseInt(i);

		tokens = coefPoly2.split(" ");
		for (String i : tokens)
			y_size++;

		y = new int[y_size];
		k = 0;
		for (String i : tokens)
			y[k++] = Integer.parseInt(i);

		Polynomial P = new Polynomial(x);
		Polynomial Q = new Polynomial(y);
		System.out.println("Polinoamele:");
		System.out.println(P.toString());
		System.out.println(Q.toString());
		System.out.println("\nRezultatele:");
		Polynomial resultPolynomial;
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			
			int scal = 0;
			int eval = 0;
			if (s.contains("ADD")) {
				resultPolynomial = P.add(Q);
				System.out.println(resultPolynomial.toString());
			}
			if (s.contains("SUBTRACT")) {
				resultPolynomial = P.subtract(Q);
				System.out.println(resultPolynomial.toString());
			}
			if (s.contains("MULTIPLY")) {
				resultPolynomial = P.multiply(Q);
				System.out.println(resultPolynomial.toString());
			}
			if (s.contains("MUL_SCAL")) {
				scal = Integer.parseInt(s.substring(9));
				resultPolynomial = P.mul_scal(scal);
				System.out.println(resultPolynomial.toString());
				resultPolynomial = Q.mul_scal(scal);
				System.out.println(resultPolynomial.toString());
			}
			if (s.contains("EVAL")) {
				eval = Integer.parseInt(s.substring(5));
				double rez = P.eval(eval);
				System.out.println(rez);
				rez = Q.eval(eval);
				System.out.println(rez);
			}

		}
	}

	// Impartirea polinoamelor e implementata, dar nu functioneaza
	
	
}

