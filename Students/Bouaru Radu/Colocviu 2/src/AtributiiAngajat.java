
public interface AtributiiAngajat {
	public void adaugaMedicament(Farmacie farmacie, Medicament medicament, Integer stoc);

	public void eliminaMedicament(Farmacie farmacie, Medicament medicament);

	public int getStocMedicament(Farmacie farmacie, Medicament medicament);

	public boolean isSoldByFarmacie(Farmacie farmacie, Medicament medicament);

	public void proceseazaReteta();
}
