
public class Palindrome {
	static boolean findPalindrome(long x) {
		String checkingPalindrome = String.valueOf(x);
		for (int i = 0; i < checkingPalindrome.length() / 2; i++)
			if (checkingPalindrome.charAt(i) != checkingPalindrome.charAt(checkingPalindrome.length() - i - 1))
				return false;
		return true;
	}
	static void largestPalindrome(int limit1, int limit2)
	{
		long largestPalindrome = 0, firstFactor = 0, secondFactor = 0;
		for(int i = limit1; i < limit2; i++)
			for(int j = limit1; j < limit2; j++)
			{
				long checker = i*j;
				if(findPalindrome(checker))
				if(checker > largestPalindrome)
				{
					largestPalindrome = checker;
					firstFactor = i;
					secondFactor = j;
				}
			}
		System.out.println(largestPalindrome + " = " + firstFactor + "*" + secondFactor);
	}
	public static void main(String[] args) {
		largestPalindrome(100,999);
		largestPalindrome(1000,9999);
	}

}
