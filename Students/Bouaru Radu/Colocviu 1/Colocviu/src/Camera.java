import java.util.*;

public class Camera {
	private int numarCamera;
	private int capacitate;
	private float pret;
	private int nrPersoaneCazate;
	private String tipCamera;
	private List<Client> listaPersoaneCazate = new ArrayList<Client>();

	private static int contor = 0;

	public Camera(int capacitate, float pret, int nrPersoaneCazate, List<Client> listaClienti, int idCamera) {
		this.numarCamera = this.contor + 1;
		this.capacitate = capacitate;
		this.listaPersoaneCazate = listaClienti;
		if (nrPersoaneCazate == 1 && idCamera == 1) {
			this.pret = 2 * pret;
			this.nrPersoaneCazate = 1;
			this.tipCamera = "Single";
		} else if (nrPersoaneCazate > 1 && idCamera > 1) {
			this.pret = pret;
			this.nrPersoaneCazate = nrPersoaneCazate;
			if (nrPersoaneCazate == 2)
				this.tipCamera = "Duplex";
			else
				this.tipCamera = "Apartament";
		}
		contor++;
	}

	public boolean isFull() {
		if (this.nrPersoaneCazate == this.capacitate)
			return true;
		else
			return false;
	}

	public boolean isOccupied() {
		if (this.nrPersoaneCazate != 0)
			return true;
		else
			return false;
	}

	public float calculeazaPretCamera(int numarNopti, float discount) {
		float pret = 0;
		if (numarNopti == 1)
			pret = 50;
		else if (numarNopti == 2)
			pret = 60;
		else if (numarNopti == 3)
			pret = 85;
		else if (numarNopti > 4)
			pret = numarNopti * 60 * discount;
		return pret;
	}

	public String toString() {
		return "Camera " + numarCamera;
	}

}
