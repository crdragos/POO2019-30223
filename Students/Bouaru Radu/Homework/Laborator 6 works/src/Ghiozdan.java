
public class Ghiozdan {
	private Rechizita[] listaRechizite;
	private int listaRechiziteIndex = 0;

	public Ghiozdan(int nr)
	{
		listaRechizite = new Rechizita[nr];
	}
	public void add(Caiet newCaiet) {
		this.listaRechizite[listaRechiziteIndex++] = newCaiet;
	}
	public void add(Manual newManual) {
		this.listaRechizite[listaRechiziteIndex++] = newManual;
	}
	public void listItems() {
		for(int i=0; i<listaRechizite.length; i++)
			if(listaRechizite[i] != null)
			System.out.println(listaRechizite[i].getNume());
	}
	public void listManual() {
		for(int i=0; i<listaRechizite.length; i++)
			if(listaRechizite[i] instanceof Manual && listaRechizite[i] != null)
			System.out.println(listaRechizite[i].getNume());
	}
	public void listCaiet() {
		for(int i=0; i<listaRechizite.length; i++)
			if(listaRechizite[i] instanceof Caiet && listaRechizite[i] != null)
			System.out.println(listaRechizite[i].getNume());
	}
	public int getNrRechizite()
	{
		return listaRechiziteIndex;
		
	}
	public int getNrManuale() {
		int manualeCount = 0;
		for(int i=0; i<listaRechizite.length; i++)
			if(listaRechizite[i] instanceof Manual)
				manualeCount++;
		return manualeCount;
		
	}
	public int getNrCaiete() {
		int caieteCount = 0;
		for(int i=0; i<listaRechizite.length; i++)
			if(listaRechizite[i] instanceof Caiet)
				caieteCount++;
		return caieteCount;
	}
	

}
