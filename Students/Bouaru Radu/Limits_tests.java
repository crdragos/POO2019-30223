

public class Limits_tests {
	public static void main(String[] args) {
		// Tipurile primitive de date si limitele lor

		// Tipurile de intregi:

		byte byteNumber_max = Byte.MAX_VALUE;
		short shortNumber_max = Short.MAX_VALUE;
		int intNumber_max = Integer.MAX_VALUE;
		long longNumber_max = Long.MAX_VALUE;

		byte byteNumber_min = Byte.MIN_VALUE;
		short shortNumber_min = Short.MIN_VALUE;
		int intNumber_min = Integer.MIN_VALUE;
		long longNumber_min = Long.MIN_VALUE;

		// Tipurile in virgula mobila:

		float floatNumber = (float)3.14159265358979323846264338327950288419716939937510;
		double doubleNumber = (double)3.14159265358979323846264338327950288419716939937510;
		float floatNumber1 = (float)3.14159265358979323846264338327950288419716939937510 - (float)2.718;
		double doubleNumber1 = (double)3.14159265358979323846264338327950288419716939937510 - (double)2.718;
		
		// Pentru intregi:
		//6.3.1
		System.out.println("Maximurile pentru fiecare tip primitiv de intregi:");
		System.out.println(byteNumber_max + "\n" + shortNumber_max + "\n" + intNumber_max + "\n" + longNumber_max);
		byteNumber_max++;
		shortNumber_max++;
		intNumber_max++;
		longNumber_max++;
		System.out.println("Maximurile incrementate:");
		System.out.println(byteNumber_max + "\n" + shortNumber_max + "\n" + intNumber_max + "\n" + longNumber_max);
		//6.3.2
		System.out.println("\nMinimurile pentru fiecare tip primitiv de intregi:");
		System.out.println(byteNumber_min + "\n" + shortNumber_min + "\n" + intNumber_min + "\n" + longNumber_min);
		byteNumber_min--;
		shortNumber_min--;
		intNumber_min--;
		longNumber_min--;
		System.out.println("Minimurile decrementate:");
		System.out.println(byteNumber_min + "\n" + shortNumber_min + "\n" + intNumber_min + "\n" + longNumber_min);

		//Pentru virgula mobila:
		//6.3.3
		System.out.println("\nVirgula mobila:");
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		//6.3.4
		System.out.println("Scaderile pi(up to 50 digits) - e(up to 3 digits):");
		System.out.println(floatNumber1);
		System.out.println(doubleNumber1);
	}
}
