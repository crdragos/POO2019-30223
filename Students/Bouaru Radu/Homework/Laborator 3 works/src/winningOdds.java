
public class winningOdds {
	public static void chances()
	{
		//P = favorabil/total
		int n = 49;
		int k = 6;
		double odds = 1.0;
		//favorabil: combinari de 49 luate cate 6
		for(int i = k; i>=1; i--)
		{
			odds *= n/i;
			n--;
			
		}
		System.out.println(1.0/odds);
		
	}
	public static void main(String[] args) {
		chances();
	}

}
