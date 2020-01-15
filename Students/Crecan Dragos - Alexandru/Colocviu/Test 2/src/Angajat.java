import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Angajat implements AtributiiAngajat, Comparable {

    private String nume;
    private Integer ID;
    private Date dataAngajare;
    private Double bonusSalariu;

    public Angajat(String nume, Integer ID, Date dataAngajare, Double bonusSalariu) {
        this.nume = nume;
        this.ID = ID;
        this.dataAngajare = dataAngajare;
        this.bonusSalariu = bonusSalariu;
    }

    @Override
    public void adaugaMedicamente(Medicament medicament, Integer cantitate, Farmacie farmacie) {
        farmacie.getMedicamente().put(cantitate, medicament);
    }

    @Override
    public void eliminaMedicamenet(Medicament medicament, Farmacie farmacie) {
        Set set = farmacie.getMedicamente().entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            if (mapEntry.getValue().equals(medicament.getDenumire())) {
                set.remove(mapEntry);
            }
        }
    }

    @Override
    public boolean verificaStocMedicament(Farmacie farmacie, Medicament medicament) {
        Set set = farmacie.getMedicamente().entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            if (mapEntry.getValue().equals(medicament.getDenumire())) {
                if (mapEntry.getKey().equals(0)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean verificaVanzareMedicament(Farmacie farmacie, Medicament medicament) {
        Set set = farmacie.getMedicamente().entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            if (mapEntry.getValue().equals(medicament.getDenumire())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public Double getBonusSalariu() {
        return bonusSalariu;
    }

    public void setBonusSalariu(Double bonusSalariu) {
        this.bonusSalariu = bonusSalariu;
    }

    @Override
    public void modificaStoc() {

    }

   /* @Override
    public void modificaStoc(Medicament medicament, Farmacie farmacie) {
        Set set = farmacie.getMedicamente().entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            if (mapEntry.getValue().equals(medicament.getDenumire())) {
                mapEntry.
            }
        }
    }*/

    @Override
    public void proceseazaReteta(Pacient pacient) {
        Reteta reteta = pacient.getReteta();
        this.bonusSalariu = this.bonusSalariu + 0.15 * reteta.getCostTotal();
    }

    @Override
    public int compareTo(Object o) {
        Angajat angajat = (Angajat) o;

        if (this.bonusSalariu.equals(angajat.bonusSalariu)) {
            return 0;
        } else if (this.bonusSalariu > angajat.bonusSalariu) {
            return 1;
        } else if (this.bonusSalariu < angajat.bonusSalariu) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Nume: " + this.nume + " | ID: " + this.ID + " | Data angajate: " + this.dataAngajare.toString() + " | Bonus: " + this.bonusSalariu;
    }
}
