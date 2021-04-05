import java.util.ArrayList;
import java.util.List;

public abstract class Pacient {
	private String nume;
	private String prenume;
	private Integer varsta;
	private char sex;
	private List<Medicament> medicamentePrescrise = new ArrayList<Medicament>();
	

	public Pacient(String nume, String prenume, Integer varsta, char sex, List<Medicament> medicamente) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
		this.setMedicamentePrescrise(medicamente);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Integer getVarsta() {
		return varsta;
	}

	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public List<Medicament> getMedicamentePrescrise() {
		return medicamentePrescrise;
	}

	public void setMedicamentePrescrise(List<Medicament> medicamentePrescrise) {
		this.medicamentePrescrise = medicamentePrescrise;
	}

}
