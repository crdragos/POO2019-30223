public class Medicament {

    private String denumire;
    private String producator;
    private Double pret;
    private Double gramaj;

    public Medicament(String denumire, String producator, Double pret, Double gramaj) {
        this.denumire = denumire;
        this.producator = producator;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Double getGramaj() {
        return gramaj;
    }

    public void setGramaj(Double gramaj) {
        this.gramaj = gramaj;
    }
}
