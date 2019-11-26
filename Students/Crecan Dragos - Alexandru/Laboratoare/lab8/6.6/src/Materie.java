public class Materie {
    private final String nume;
    private float notaLaborator;
    private float notaExamen;
    private float notaFinala;
    private boolean promLab;
    private boolean promMaterie;

    public Materie(String nume, float notaLaborator, float notaExamen) {
        this.nume = nume;
        this.notaLaborator = notaLaborator;
        this.notaExamen = notaExamen;
        this.notaFinala = (float) ((0.3 * notaLaborator) + (0.7 * notaExamen));
        if (this.notaLaborator >= 5) {
            this.promLab = true;
        } else {
            this.promLab = false;
        }
        if (this.notaFinala >= 5) {
            this.promMaterie = true;
        } else {
            this.promMaterie = false;
        }
    }

    public void setNotaLaborator(float notaLaborator) {
        this.notaLaborator = notaLaborator;
    }

    public void setNotaExamenFinal(float notaExamen) {
        this.notaExamen = notaExamen;
    }

    public void setPromLab() {
        if (this.notaLaborator >= 5) {
            this.promLab = true;
        } else {
            this.promLab = false;
        }
    }

    public void setPromMaterie() {
        if (this.notaFinala >= 5) {
            this.promMaterie = true;
        } else {
            this.promMaterie = false;
        }
    }

    public String getNume() {
        return this.nume;
    }

    public float getNotaLaborator() {
        return this.notaLaborator;
    }

    public float getNotaExamenFinal() {
        return this.notaExamen;
    }

    public float getNotaFinala() {
        return this.notaFinala;
    }

    public boolean getPromLab() {
        return this.promLab;
    }

    public boolean getPromMaterie() {
        return this.promMaterie;
    }
}
