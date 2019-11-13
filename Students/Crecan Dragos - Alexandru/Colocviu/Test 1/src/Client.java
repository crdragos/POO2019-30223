
public class Client extends Persoana{
	private int nrCamera;
	private int checkInDate;
	private int checkOutDate;
	
	public Client(int ID, String nume, String nrTelefon) {
		super(ID, nume, nrTelefon);
	}
	
	public void setNrCamera(int nrCamera) {
		this.nrCamera = nrCamera;
	}
	
	public void setCheckInDate(int checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public void setCheckOutDate(int checkOutDate) {
		this.checkInDate = checkOutDate;
	}
	
	public int getNrCamera() {
		return this.nrCamera;
	}
	
	public int getCheckInDate() {
		return this.checkInDate;
	}
	
	public int getCheckOutDate() {
		return this.checkOutDate;
	}

}
