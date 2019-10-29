public class Concert {
	private String titluConcert;
	private String headlinerConcert;
	private String genre;
	private int bilete;
	private String dataConcert;
	public Concert(String title, String band, int noTickets, String date, String gen)
	{
		this.setTitluConcert(title);
		this.setHeadlinerConcert(band);
		this.setBilete(noTickets);
		this.setDataConcert(date);
		this.setGenre(gen);
	}
	public Concert()
	{
		this.setBilete(1000);
		this.setDataConcert("24/02/2020");
		this.setHeadlinerConcert("Alcest");
		this.setGenre("Shoegaze & beyond");
		this.setTitluConcert("Lansare album");
	}
	public String getTitluConcert() {
		return titluConcert;
	}
	public void setTitluConcert(String titluConcert) {
		this.titluConcert = titluConcert;
	}
	public String getHeadlinerConcert() {
		return headlinerConcert;
	}
	public void setHeadlinerConcert(String headlinerConcert) {
		this.headlinerConcert = headlinerConcert;
	}
	public int getBilete() {
		return bilete;
	}
	public void setBilete(int bilete) {
		this.bilete = bilete;
	}
	public String getDataConcert() {
		return dataConcert;
	}
	public void setDataConcert(String dataConcert) {
		this.dataConcert = dataConcert;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String gen) {
		this.genre = gen;
	}
}
