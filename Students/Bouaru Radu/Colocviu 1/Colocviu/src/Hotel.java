import java.util.*;

public class Hotel {
	private String numeHotel;
	private List<Angajat> listaAngajati = new ArrayList<Angajat>();
	public static List<Client> listaClienti = new ArrayList<Client>();
	public static List<Camera> listaCamere = new ArrayList<Camera>();

	public static int factura_nr = 1;

	public Hotel(String nume) {
		this.numeHotel = nume;
	}

	public void addAngajat(String numeAngajat, String numarTelefon, String dataAngajare, int numarClienti) {
		Angajat newAngajat = new Angajat(numeAngajat, numarTelefon, dataAngajare, numarClienti);
		this.listaAngajati.add(newAngajat);
	}

	public void addAngajat(Angajat newAngajat) {
		this.listaAngajati.add(newAngajat);
	}

	public void addClient(Client newClient) {
		this.listaClienti.add(newClient);
	}

	public void addClient(String numeClient, String numarTelefon, int idCamera, String dataCheckIn, String dataCheckOut,
			int clientId) {
		Client newClient = new Client(numeClient, numarTelefon, idCamera, dataCheckIn, dataCheckOut, clientId);
		Hotel.listaClienti.add(newClient);
	}

	public void addCamera(Camera newCamera) {
		this.listaCamere.add(newCamera);
	}

	public void emiteFactura(Client client) {
		System.out.println("Hotelul " + numeHotel);
		System.out.println("Factura nr." + factura_nr);
		System.out.println("Domnul/Doamna " + client.getNume() + ", cazat la camera " + client.getIdCamera()
				+ " a stat in hotel de la data de " + client.getDataCheckIn() + " pana la data de "
				+ client.getDataCheckOut());
		System.out.println("Speram ca v-a placut sederea la noi!");
		System.out.println();
		factura_nr++;
	}

	public void showAngajati() {
		System.out.println("Angajatii nostri sunt: ");
		Collections.sort(listaAngajati, new AngajatiComparator());
		Iterator<Angajat> angajatiIterator = listaAngajati.iterator();
		while (angajatiIterator.hasNext()) {
			System.out.println(angajatiIterator.next());
		}
		System.out.println();
	}

	public void showClienti() {
		System.out.println("Clientii nostri sunt:");
		Collections.sort(listaClienti, new ClientiComparator());
		Iterator<Client> clientiIterator = listaClienti.iterator();
		while (clientiIterator.hasNext()) {
			System.out.println(clientiIterator.next());
		}
		System.out.println();
	}

	public void showCamere() {
		System.out.println("Camerele libere:");

		Iterator<Camera> cameraIterator = listaCamere.iterator();
		while (cameraIterator.hasNext()) {
			Camera _camera = cameraIterator.next();
			if (_camera.isOccupied() == false)
				System.out.println(_camera);
		}
		System.out.println();
	}

	public void showStatistici() {
		int countFull = 0;
		int countEmpty = 0;
		Iterator<Camera> cameraIterator = listaCamere.iterator();
		while (cameraIterator.hasNext()) {
			Camera _camera = cameraIterator.next();
			if (_camera.isOccupied() == true)
				countFull++;
			else
				countEmpty++;
		}
		System.out.println(
				"In momentul actual, " + countEmpty + " camere sunt libere, iar " + countFull + " camere sunt ocupate");
		System.out.println();
	}

}
