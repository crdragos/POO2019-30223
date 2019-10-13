
public class FibonacciEvenSum {
	
	static long fibonacci(int n)
	{
		double root1 = (1+Math.sqrt(5)) / 2;
		double root2 = (1-Math.sqrt(5)) / 2;
		double fibn = (Math.pow(root1, n) - Math.pow(root2, n)) / Math.sqrt(5);
		return (long) Math.ceil((long)fibn);
	}
	static int max_fibnr()
	{
		int index = 0;
		while(fibonacci(index) < 4e6)
			index++;
		return index;
	}
	public static void main(String[] args) {
		//Fibonacci in O(1) folosind numarul de aur (Phi)
		//Ruleaza corect pana in F(1475), apoi aproximarile devin prea mari
		
		int sum = 0;
		for(int i = 1; i<max_fibnr(); i++)
			if(fibonacci(i) % 2 == 0)
				sum += fibonacci(i);
		
		System.out.println(sum);
	}

}
