import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		double c, d;
		
		System.out.println("Dati primul numar: ");
		a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Dati al doilea numar: ");
		b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Dati al treilea numar: ");
		c = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Dati al patrulea numar: ");
		d = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Numerele sunt: " + a + " " + b + " " + c + " " + d);
		
		scanner.close();
	}

}
