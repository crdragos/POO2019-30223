public class TestHotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		
		System.out.println("Initial in hotel aveam: " + hotel.getNrAngajati() + " angajati si " + hotel.getNrClienti() + " clienti.");
		
		
		Angajat angajat1 = new Angajat(1, "Andrei", "0752365259");
		hotel.angajeaza(angajat1);
		
		Angajat angajat2 = new Angajat(2, "Mihaela", "075235749");
		hotel.angajeaza(angajat2);
		
		Angajat angajat3 = new Angajat(3, "Mihai", "0752366678");
		hotel.angajeaza(angajat3);
		
		Angajat angajat4 = new Angajat(4, "Andreea", "0753665259");
		hotel.angajeaza(angajat4);
		
		hotel.arataAngajati();
		
		Client client1 = new Client(1, "Dragos", "0752269967");
		hotel.adaugaClient(client1);
		
		Client client2 = new Client(1, "Radu", "075579967");
		client2.setCheckInDate(5);
		client2.setCheckOutDate(10);
		hotel.adaugaClient(client2);

		Client client3 = new Client(1, "Marin", "0752268667");
		hotel.adaugaClient(client3);

		Client client4 = new Client(1, "Razvan", "0735269967");
		client4.setCheckInDate(1);
		client4.setCheckOutDate(3);
		hotel.adaugaClient(client4);
		
		hotel.arataClienti();
		
		System.out.println("Acum in hotel aveam: " + hotel.getNrAngajati() + " angajati si " + hotel.getNrClienti() + " clienti.");
		
		hotel.creazaCamere();
		angajat1.cazeazaClient(client2, 2);
		angajat1.cazeazaClient(client4, 8);
		hotel.arataCaemreLibere();
	}

}
