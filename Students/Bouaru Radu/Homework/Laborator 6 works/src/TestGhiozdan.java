
public class TestGhiozdan {
	public static void main(String args[])
	{
		int maxRechizite = 20;
		Ghiozdan myGhiozdan = new Ghiozdan(maxRechizite);
		Caiet myCaiet[] = new Caiet[5];
		Manual myManual[] = new Manual[5];
		
		for(int i = 0; i < 5; i++)
		{
			myCaiet[i] = new Caiet();
			myCaiet[i].eticheta = "POO " + i;
			myManual[i] = new Manual();
			myManual[i].eticheta = "Java " + i;
			myGhiozdan.add(myCaiet[i]);
			myGhiozdan.add(myManual[i]);
		}
		System.out.println(myGhiozdan.getNrRechizite());
		System.out.println("Rechizite:");
		myGhiozdan.listItems();
		System.out.println("Caiete:");
		myGhiozdan.listCaiet();
		System.out.println("Manuale:");
		myGhiozdan.listManual();
			
	}
}
