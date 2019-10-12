import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class Boabe {

	public static void main(String args[])
	{
		BigInteger x = new BigInteger("2");
		BigInteger result = new BigInteger("0");

		for (int i = 1; i <= 64; i++)
			result = result.add(x.pow(i));

		String rez = NumberFormat.getNumberInstance(Locale.US).format(result);
		System.out.println("Numarul total de boabe de grau de pe tabla: " + rez);
	}
}
