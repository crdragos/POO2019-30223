
public class CompanieTransportPublic {
	private String numeCompanie;
	private int numarSoferi;
	private int numarAutovehicule;
	private int numarControlori;

	public CompanieTransportPublic() {
		this.numeCompanie = "CTP Cluj-Napoca";
		this.numarSoferi = 100;
		this.numarAutovehicule = 200;
		this.numarControlori = 1;
	}

	public String getNumeCompanie() {
		return numeCompanie;
	}

	public void setNumeCompanie(String numeCompanie) {
		this.numeCompanie = numeCompanie;
	}

	public int getNumarSoferi() {
		return numarSoferi;
	}

	public void setNumarSoferi(int numarSoferi) {
		this.numarSoferi = numarSoferi;
	}

	public int getNumarAutovehicule() {
		return numarAutovehicule;
	}

	public void setNumarAutovehicule(int numarAutovehicule) {
		this.numarAutovehicule = numarAutovehicule;
	}

	public int getNumarControlori() {
		return numarControlori;
	}

	public void setNumarControlori(int numarControlori) {
		this.numarControlori = numarControlori;
	}
}
