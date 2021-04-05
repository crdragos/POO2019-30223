
public class CasaBilete extends Concert{

	private int casieri;
	private int caseMarcat;
	private int onlineTickets;
	private int vandute;
	
	public CasaBilete(int casieri, int caseMarcat, int onlineTickets, int vandute)
	{
		this.setCasieri(casieri);
		this.setCaseMarcat(caseMarcat);
		this.setOnlineTickets(onlineTickets);
		this.setVandute(vandute);
	}
	public int getCasieri() {
		return casieri;
	}
	public void setCasieri(int casieri) {
		this.casieri = casieri;
	}
	public int getCaseMarcat() {
		return caseMarcat;
	}
	public void setCaseMarcat(int caseMarcat) {
		this.caseMarcat = caseMarcat;
	}
	public int getOnlineTickets() {
		return onlineTickets;
	}
	public void setOnlineTickets(int onlineTickets) {
		this.onlineTickets = onlineTickets;
	}
	public int getVandute() {
		return vandute;
	}
	public void setVandute(int vandute) {
		this.vandute = vandute;
	}
	public int getRamase()
	{
		return super.getBilete() - getVandute();
	}

}
