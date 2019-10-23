import java.util.Scanner;

public class stringRef {
	public static boolean search(char a)
	{
		String x = "aeiouAEIOU";
		for(int i=0; i<x.length(); i++)
			if(x.charAt(i) == a)
				return true;
		return false;
	}
	public static void countVowels(String x)
	{
		int j = 0;
		for(int i=0; i< x.length(); i++)
			if(search(x.charAt(i)))
				j++;
			System.out.println(j+ " vowels");
	}
	public static void findIndex(char x, String s)
	{
		System.out.println(x + " can be found at the following indexes: ");
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i) == x)
				System.out.println(i);
	}
	public static void main(String[] args) {
		String y = "YEEET";
		countVowels(y);
		Scanner myScanner = new Scanner(System.in);
		char c = myScanner.next().charAt(0);
		findIndex(c, y);
		myScanner.close();
	}

}
