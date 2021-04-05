
public class Controlor extends CompanieTransportPublic{
	private String numeControlor;
	private String prenumeControlor;
	private int varstaControlor;
	private int liniaOperationala;
	public Controlor(String nume, String prenume, int varsta, int linie)
	{
		this.numeControlor = nume;
		this.prenumeControlor = prenume;
		this.varstaControlor = varsta;
		this.liniaOperationala = linie;
	}
	public String getNumeControlor() {
		return numeControlor;
	}
	public void setNumeControlor(String numeControlor) {
		this.numeControlor = numeControlor;
	}
	public String getPrenumeControlor() {
		return prenumeControlor;
	}
	public void setPrenumeControlor(String prenumeControlor) {
		this.prenumeControlor = prenumeControlor;
	}
	public int getVarstaControlor() {
		return varstaControlor;
	}
	public void setVarstaControlor(int varstaControlor) {
		this.varstaControlor = varstaControlor;
	}
	public int getLiniaOperationala() {
		return liniaOperationala;
	}
	public void setLiniaOperationala(int liniaOperationala) {
		this.liniaOperationala = liniaOperationala;
	}
}
