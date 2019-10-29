
public class Sofer extends CompanieTransportPublic{
	private String nume;
	private String prenume;
	private int varsta;
	private int numarPermis;
	
	public Sofer()
	{
		this.nume = "Andrei";
		this.prenume = "Popescu";
		this.varsta = 57;
		this.numarPermis = 1262342;
	}
	public String getNume()
	{
		return this.nume;
	}
	public String getPrenume()
	{
		return this.prenume;
	}
	public int getVarsta()
	{
		return this.varsta;
	}
	public int getNumarPermis()
	{
		return this.numarPermis;
	}
	public void setNume(String nume)
	{
		this.nume = nume;
	}
	public void setPrenume(String prenume)
	{
		this.prenume = prenume;
	}
	public void setVarsta(int varsta)
	{
		this.varsta = varsta;
	}
	public void setNumarPermis(int numarPermis)
	{
		this.numarPermis = numarPermis;
	}
}
