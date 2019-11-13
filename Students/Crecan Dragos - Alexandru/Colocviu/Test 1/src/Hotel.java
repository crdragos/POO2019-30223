
public class Hotel {
	private Angajat[] angajati;
	private Client[] clienti;
	private Camera[] camere;
	private int nrAngajati = 0;
	private int nrClienti = 0;

	public Hotel() {
		this.angajati = new Angajat[10];
		this.clienti = new Client[20];
		this.camere = new Camera[30];
	}

	public void angajeaza(Angajat newAngajat) {
		this.angajati[this.nrAngajati] = newAngajat;
		this.nrAngajati++;
	}

	public void adaugaClient(Client newClient) {
		this.clienti[this.nrClienti] = newClient;
		this.nrClienti++;
		this.camere[newClient.getNrCamera()] = new Camera(newClient.getNrCamera());
		this.camere[newClient.getNrCamera()].oaspetiCazati[this.camere[newClient.getNrCamera()].nrPersoaneCazate] = newClient;
		this.camere[newClient.getNrCamera()].nrPersoaneCazate++;
	}

	public void emiteFactura(Client client) {
		Camera camera = this.camere[client.getNrCamera()];
		int nrNopti = client.getCheckOutDate() - client.getCheckInDate();
		if (nrNopti > 3) {
			System.out.println("Pret total : " + camera.calculeazaPret(nrNopti, 10));
		} else {
			System.out.println("Pret total : " + camera.calculeazaPret(nrNopti, 0));
		}
	}

	public void arataClienti() {
		System.out.println("Clientii sunt: ");
		for (int i = 0; i < this.nrClienti; i++) {
			System.out.println(this.clienti[i].getNume());
		}
	}

	public void arataAngajati() {
		System.out.println("Angajatii sunt: ");
		for (int i = 0; i < this.nrAngajati; i++) {
			System.out.println(this.angajati[i].getNume());
		}
	}

	public void arataCaemreLibere() {
		System.out.println("Camerele libere sunt: ");
		for (int i = 0; i < this.camere.length; i++) {
			if (this.camere[i].verificaDisponibilitate() == true) {
				System.out.print(this.camere[i].getNrCamera() + " ");
			}
		}
	}

	public void verificaCamere() {
		int nrCamereOcupate = 0;
		for (int i = 0; i < this.camere.length; i++) {
			if (this.camere[i].verificaDisponibilitate() == false) {
				nrCamereOcupate++;
			}
		}
		int nrCamereLibere = this.camere.length - nrCamereOcupate;

		System.out.println(
				"In hotel avem " + nrCamereOcupate + " camere ocupate si " + nrCamereLibere + " camere libere.");
	}

	public void creazaCamere() {
			for (int i = 0; i < camere.length; i++) {
				this.camere[i] = new Camera(i + 1);
			}
	}

	public Camera getCamera(int index) {
		for (int i = 0; i < this.camere.length; i++) {
			if (this.camere[i].getNrCamera() == index) {
				return this.camere[i];
			}
		}

		System.err.println("Camera cu numarul " + index + " nu se gaseste in hotelul nostru!");
		return null;
	}

	public int getNrAngajati() {
		return this.nrAngajati;
	}

	public int getNrClienti() {
		return this.nrClienti;
	}

}
