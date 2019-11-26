public class Zi {
    private String nume;
    private boolean lucratoare;

    public Zi (String nume, boolean lucratoare) {
        this.nume = nume;
        this.lucratoare = false;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setLucratoare(boolean lucratoare) {
        this.lucratoare = lucratoare;
    }

    public String getNume() {
        return this.nume;
    }

    public boolean getLucratoare() {
        return this.lucratoare;
    }

    @Override
    public String toString() {
        if (this.lucratoare == true) {
            return "Ziua de " + this.getNume() + " este o zi lucratoare";
        } else {
            return "Ziua de " + this.getNume() + " este o zi nelucartoare";
        }
    }
}
