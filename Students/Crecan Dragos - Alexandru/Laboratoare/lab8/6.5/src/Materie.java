public class Materie {
    private final String nume;
    private float nota;
    private boolean promovat;

    public Materie(String nume, float nota) {
        this.nume = nume;
        this.nota = nota;
        if (this.nota >= 4.5) {
            this.promovat = true;
        } else {
            this.promovat = false;
        }
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setPromovat() {
        if (this.nota >= 4.5) {
            this.promovat = true;
        } else {
            this.promovat = false;
        }
    }

    public String getNume() {
        return this.nume;
    }

    public float getNota() {
        return this.nota;
    }

    public boolean getPromovat() {
        return this.promovat;
    }

}
