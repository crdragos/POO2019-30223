
public class Goldbach {
	static boolean isPrime(int n)
	{
		if(n == 1)
			return false;
		for(int i=2; i<= n/2; i++)
			if(n % i == 0)
				return false;
		
	return true;
		
	}
	static void goldbach(int n)
	{
		if(n%2 != 0)
		{
			System.out.println("Number is not even");
			return;
		}
		if(n < 2)
		{
			System.out.println("Number is less than two!");
			return;
		}
		for(int i = 2; i<=n/2+1; i++)
			if(isPrime(i) && isPrime(n-i))
				System.out.println(i + "+" + (n-i));
			
	}
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		for(int i=n; i<=m; i++)
		{
			System.out.println(i + " can be expressed as: ");
			goldbach(i);
			System.out.println();
		}
			
	}

}
