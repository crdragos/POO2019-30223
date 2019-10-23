
public class lotteryGame {
	public static boolean attempt(int today_picks[])
	{

		int my_picks[] = new int[6];
		int random = 0;
		int good_picks = 0;
		
		for (int i = 0; i < 6; i++) {
			random = (int) (Math.random() * 50);
			for (int j = 0; j < i; j++)
				if (my_picks[j] == random)
					random = (int) (Math.random() * 50);
			my_picks[i] = random;
		}
		
		for(int i=0; i<6; i++)
			for(int j=0; j<6; j++)
			if(today_picks[i] == my_picks[j])
				good_picks++;
			
		if(good_picks == 6)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int today_picks[] = new int[] { 1, 6, 3, 8, 40, 37 };
		int tries = 0;
		while(!attempt(today_picks))
			tries++;
		System.out.println("To win the lottery today, you need "+ tries + " tries! Good luck paying for those entry tickets xD");

		
	}

}
