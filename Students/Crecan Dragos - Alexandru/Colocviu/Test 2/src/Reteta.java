import java.util.ArrayList;

public class Reteta {

    private ArrayList<Medicament> medicaments;
    private Integer costTotal;

    public Reteta(ArrayList<Medicament> medicaments, Integer costTotal) {
        this.medicaments = medicaments;
        this.costTotal = costTotal;
    }

    public ArrayList<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(ArrayList<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public Integer getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(Integer costTotal) {
        this.costTotal = costTotal;
    }
}
