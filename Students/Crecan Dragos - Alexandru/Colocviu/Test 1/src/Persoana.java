
public class Persoana {
	protected int ID;
	protected String nume;
	protected String nrTelefon;
	
	public Persoana() {
		System.out.println("Persoana creata cu succes.");
	}
	
	public Persoana(int ID, String Nume, String nrTelefon) {
		this.ID = ID;
		this.nume = Nume;
		this.nrTelefon = nrTelefon;
	}
	
	public void setId(int ID) {
		this.ID = ID;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public String getNrTelefon() {
		return this.nrTelefon;
	}
}
