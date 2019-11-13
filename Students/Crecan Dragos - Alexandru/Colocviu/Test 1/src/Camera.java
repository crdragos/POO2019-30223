
public class Camera {
	private int nrCamera;
	private int capacitate;
	private float pretPerNoapte;
	private float pretSpecial;
	protected Client[] oaspetiCazati;
	protected int nrPersoaneCazate;
	
	public Camera(int nrCamera) {
		this.nrCamera = nrCamera;
		this.capacitate = 2;
		this.pretPerNoapte = 150;
		this.pretSpecial = 250;
		this.oaspetiCazati = new Client[capacitate];
	}
	
	public void setNrCamera(int nrCamera) {
		this.nrCamera = nrCamera;
	}
	
	public int getNrCamera() {
		return this.nrCamera;
	}
	
	public void setCapacitate(int capacitate) {
		this.capacitate = capacitate;
	}
	
	public void setPretPerNoapte(int pretPerNoapte) {
		this.pretPerNoapte = pretPerNoapte;
	}
	
	public void setPretSpecial(int pretSpecial) {
		this.pretSpecial = pretSpecial;
	}
	
	public int getCpacitate() {
		return this.capacitate;
	}
	
	public float getPretPerNoapte() {
		return this.pretPerNoapte;
	}
	
	public float getPretSpecial() {
		return this.pretSpecial;
	}
	
	public float calculeazaPret(int nrNopti, float discount) {
		float pretIntreg = 0;
		
		if (this.capacitate != 1) {
			if (this.nrPersoaneCazate == 1) {
				pretIntreg = this.pretSpecial * nrNopti;
			} else {
				pretIntreg = this.pretPerNoapte * nrNopti;
			}
		} else {
			pretIntreg = this.pretPerNoapte * nrNopti;
		}
		
		float pretFinal = pretIntreg - ((discount / 100) * pretIntreg);
		return pretFinal;
	}
	
	public boolean verificaDisponibilitate() {
		if (this.nrPersoaneCazate == 0) {
			return true;
		} else {
			return false;
		}
	}
}
