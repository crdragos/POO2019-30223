public interface AtributiiAngajat {

    public void adaugaMedicamente(Medicament medicament, Integer cantitate, Farmacie farmacie);
    public void eliminaMedicamenet(Medicament medicament, Farmacie farmacie);
    public boolean verificaStocMedicament(Farmacie farmacie, Medicament medicament);
    public boolean verificaVanzareMedicament(Farmacie farmacie, Medicament medicament);
    public void modificaStoc();
    public void proceseazaReteta(Pacient pacient);
}
