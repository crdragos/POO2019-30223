
public class Angajat extends Persoana {
	private String dataAngajare;
	private int nrClientiServiti;
	
	public Angajat(int ID, String nume, String nrTelefon) {
		super(ID, nume, nrTelefon);
	}
	
	public void setDataAngajare(String dataAngajare) {
		this.dataAngajare = dataAngajare;
	}
	
	public void setNrClientiServiti(int nrClientiServiti) {
		this.nrClientiServiti = nrClientiServiti;
	}
	
	public String getDataAngajare() {
		return this.dataAngajare;
	}
	
	public int getNrClientiServiti() {
		return this.nrClientiServiti;
	}
	
	public void cazeazaClient(Client newClient, int nrCamera) {
		this.nrClientiServiti++;
		newClient.setNrCamera(nrCamera);
	}
	
	public void decazaeazaClient(Client oldClient, int nrCamera) {
		this.nrClientiServiti++;
		oldClient.setNrCamera(-1);
	}

}
