
public class Persoana {
	private int id = 0;
	private String nume;
	private String numarTelefon;
	
	public Persoana(String nume, String numarTelefon)
	{
		this.id++;
		this.nume = nume;
		this.numarTelefon = numarTelefon;
	}
	
	public String getNume()
	{
		return this.nume;
	}
	public String getNumarTelefon()
	{
		return this.numarTelefon;
	}
}
