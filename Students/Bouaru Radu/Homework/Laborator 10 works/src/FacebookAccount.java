import java.util.ArrayList;
import java.util.Iterator;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String locatie;
	private ArrayList<FacebookAccount> listaPrieteni;

	public FacebookAccount(String nume, int varsta, String locatie) {
		this.nume = nume;
		this.varsta = varsta;
		this.locatie = locatie;
		this.listaPrieteni = new ArrayList<FacebookAccount>();
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getLocatie() {
		return this.locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public void addFriend(FacebookAccount newFriend) {
		this.listaPrieteni.add(newFriend);
	}

	public void removeFriend(FacebookAccount toRemove) {
		this.listaPrieteni.remove(toRemove);
	}

	public void showFriends() {
		Iterator<FacebookAccount> i = this.listaPrieteni.iterator();
		System.out.println("Prietenii sunt:");
		while (i.hasNext()) {
			System.out.println(i.next().getNume());
		}
		System.out.println();
	}

	public void searchFriends(String location) {
		Iterator<FacebookAccount> i = this.listaPrieteni.iterator();
		System.out.println("Prietenii din " + location + " sunt:");
		while (i.hasNext()) {
			FacebookAccount searched = i.next();
			if (searched.getLocatie().equals(location))
				System.out.println(searched.getNume());
		}
		System.out.println();
	}

}
