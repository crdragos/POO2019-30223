import java.util.*;

public class TestHotel {
	public static void main(String args[])
	{
		Hotel myHotel = new Hotel("Intercontinental");
		
		Angajat a1 = new Angajat("Dorian Popa", "0740111000", "13/11/2018", 4);
		Angajat a2 = new Angajat("Roger Waters", "0740111001", "13/11/2017", 15);
		Angajat a3 = new Angajat("David Gilmour", "0740111051", "13/11/2016", 12);
		
		Client c1 = new Client("Pink Floyd", "0747474747",1, "7/11/2019", "13/11/2019", 1);
		Client c2 = new Client("Solstafir", "0747474747",2, "9/11/2019", "13/11/2019", 2);
		Client c3 = new Client("Alcest", "0747474747",2, "8/11/2019", "13/11/2019", 3);
		Client c4 = new Client("Arkona", "0747474746",2, "3/11/2019", "13/11/2019", 4);
		
		myHotel.addAngajat(a1);
		myHotel.addAngajat(a2);
		myHotel.addAngajat(a3);
		myHotel.addClient(c1);
		myHotel.addClient(c2);
		myHotel.addClient(c3);
		myHotel.showAngajati();
		myHotel.showClienti();
		
		List<Client> listaClientiCamera1 = new ArrayList<Client>();
		List<Client> listaClientiCamera2 = new ArrayList<Client>();
		List<Client> listaClientiCamera3 = new ArrayList<Client>();
		
		listaClientiCamera1.add(c1);
		Camera newCamera1 = new Camera(1, 50, 1, listaClientiCamera1, 1);
		
		listaClientiCamera2.add(c2);
		listaClientiCamera2.add(c3);
		
		Camera newCamera2 = new Camera(3, 75, 2, listaClientiCamera2, 2);
		
		Camera newCamera3 = new Camera(4, 85, 0, listaClientiCamera3, 3);
		
		myHotel.addCamera(newCamera1);
		myHotel.addCamera(newCamera2);
		myHotel.addCamera(newCamera3);
		
		myHotel.showCamere();
		
		myHotel.showStatistici();
		
		myHotel.emiteFactura(c1);
		myHotel.emiteFactura(c2);
		
		a1.cazeazaClient(c4);
		
		myHotel.showClienti();
		
		a1.decazeazaClient(c1);
		
		myHotel.showClienti();
		
	}
}
