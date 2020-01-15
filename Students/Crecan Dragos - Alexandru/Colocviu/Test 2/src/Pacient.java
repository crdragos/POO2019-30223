public abstract class Pacient {

    private String nume;
    private String prenume;
    private Integer varsta;
    private String sex;
    private Double gradDeSeveritate;
    private Reteta reteta;

    public Pacient(String nume, String prenume, Integer varsta, String sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getGradDeSeveritate() {
        return gradDeSeveritate;
    }

    public void setGradDeSeveritate(Double gradDeSeveritate) {
        this.gradDeSeveritate = gradDeSeveritate;
    }

    public Reteta getReteta() {
        return reteta;
    }

    public void setReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    public void calculareGradDeSeveritate() {
        this.gradDeSeveritate = reteta.getMedicaments().size() * 0.2;
    }
}
