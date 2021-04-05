
public class Client extends Persoana {

	private int idCamera;
	private int idClient;
	private String dataCheckIn;
	private String dataCheckOut;

	public Client(String nume, String numarTelefon, int idCamera, String dataCheckIn, String dataCheckOut,
			int idClient) {
		super(nume, numarTelefon);
		this.idCamera = idCamera;
		this.idClient = idClient;
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
	}
	// Stiu ca e cam fishy treaba cu id-ul adaugat manual xD

	public int getIdCamera() {
		return this.idCamera;
	}

	public String getDataCheckIn() {
		return this.dataCheckIn;
	}

	public String getDataCheckOut() {
		return this.dataCheckOut;
	}

	public String toString() {
		return this.getNume();
	}

}
