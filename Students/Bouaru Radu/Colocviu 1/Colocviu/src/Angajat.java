
public class Angajat extends Persoana{
	
	private String dataAngajare;
	private int clientiServiti;

	public Angajat(String nume, String numarTelefon, String dataAngajare, int clientiServiti) {
		super(nume, numarTelefon);
		this.dataAngajare = dataAngajare;
		this.clientiServiti = clientiServiti;	
	}
	public void cazeazaClient(String numeClient, String numarTelefonClient, int idCamera, String dataCheckIn, String dataCheckOut, int idClient)
	{
		Client newClient;
		if(idCamera == 1) //regim Single
		newClient = new Client(numeClient, numarTelefonClient, 1, dataCheckIn, dataCheckOut, idClient);
		else
			newClient = new Client(numeClient, numarTelefonClient, idCamera, dataCheckIn, dataCheckOut, idClient);
		Hotel.listaClienti.add(newClient);
	}
	public void cazeazaClient(Client newClient)
	{
		Hotel.listaClienti.add(newClient);
	}
	public void decazeazaClient(String numeClient, String numarTelefonClient, int idCamera, String dataCheckIn, String dataCheckOut)
	{
		Client client = new Client(numeClient, numarTelefonClient, 1, dataCheckIn, dataCheckOut, idCamera);
		Hotel.listaClienti.remove(client);
	}
	public void decazeazaClient(Client client)
	{
		Hotel.listaClienti.remove(client);
	}
	public int getClientiServiti()
	{
		return this.clientiServiti;
	}
	public String toString()
	{
		return this.getNume();
	}
}
