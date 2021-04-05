import java.util.Date;

public class Angajat implements AtributiiAngajat {
	private String nume;
	private Date dataAngajarii;
	private Long ID;
	private Double bonusSalariu;
	private Long idFarmacie;

	public Angajat(String nume, Date dataAngajarii, Long ID, Double bonusSalariu, Long idFarmacie) {
		this.nume = nume;
		this.dataAngajarii = dataAngajarii;
		this.ID = ID;
		this.bonusSalariu = bonusSalariu;
		this.idFarmacie = idFarmacie;
	}

	public Double getBonusSalariu() {
		return bonusSalariu;
	}

	public void setBonusSalariu(Double bonusSalariu) {
		this.bonusSalariu = bonusSalariu;
	}

	public Date getDataAngajarii() {
		return dataAngajarii;
	}

	public void setDataAngajarii(Date dataAngajarii) {
		this.dataAngajarii = dataAngajarii;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getIdFarmacie() {
		return idFarmacie;
	}

	public void setIdFarmacie(Long idFarmacie) {
		this.idFarmacie = idFarmacie;
	}

	@Override
	public void adaugaMedicament(Farmacie farmacie, Medicament medicament, Integer stoc) {
		farmacie.getStocMedicamente().put(medicament, stoc);
	}

	@Override
	public void eliminaMedicament(Farmacie farmacie, Medicament medicament) {
		farmacie.getStocMedicamente().remove(medicament);

	}

	@Override
	public int getStocMedicament(Farmacie farmacie, Medicament medicament) {
		return farmacie.getStocMedicamente().get(medicament);
	}

	@Override
	public boolean isSoldByFarmacie(Farmacie farmacie, Medicament medicament) {
		if (farmacie.getStocMedicamente().containsKey(medicament))
			return true;
		else
			return false;
	}

	@Override
	public void proceseazaReteta() {

	}

}
