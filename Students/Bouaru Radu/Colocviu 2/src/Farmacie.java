import java.util.HashMap;
import java.util.List;

public class Farmacie {
	private Long ID;
	private String denumire;
	private String adresa;
	private String nrTelefon;
	private String website;
	private HashMap<Medicament, Integer> stocMedicamente;
	private HashMap<String, Integer> reteteProcesate;
	private List<Angajat> angajati;

	public Farmacie(Long ID, String denumire, String adresa, String nrTelefon, String website,
			HashMap<Medicament, Integer> stocMedicamente, HashMap<String, Integer> reteteProcesate,
			List<Angajat> angajati) {
		this.setID(ID);
		this.denumire = denumire;
		this.adresa = adresa;
		this.nrTelefon = nrTelefon;
		this.website = website;
		this.stocMedicamente = stocMedicamente;
		this.reteteProcesate = reteteProcesate;
		this.angajati = angajati;
	}

	// deep copy
	public Farmacie(Farmacie otherFarmacie) {
		this(otherFarmacie.getID(), otherFarmacie.getDenumire(), otherFarmacie.getAdresa(),
				otherFarmacie.getNrTelefon(), otherFarmacie.getWebsite(), otherFarmacie.getStocMedicamente(),
				otherFarmacie.getReteteProcesate(), otherFarmacie.getAngajati());
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public HashMap<Medicament, Integer> getStocMedicamente() {
		return stocMedicamente;
	}

	public void setStocMedicamente(HashMap<Medicament, Integer> stocMedicamente) {
		this.stocMedicamente = stocMedicamente;
	}

	public HashMap<String, Integer> getReteteProcesate() {
		return reteteProcesate;
	}

	public void setReteteProcesate(HashMap<String, Integer> reteteProcesate) {
		this.reteteProcesate = reteteProcesate;
	}

	public List<Angajat> getAngajati() {
		return angajati;
	}

	public void setAngajati(List<Angajat> angajati) {
		this.angajati = angajati;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}
}
