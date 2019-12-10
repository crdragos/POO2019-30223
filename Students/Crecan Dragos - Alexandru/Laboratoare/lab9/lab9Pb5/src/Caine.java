public class Caine {
    private String nume;
    private final int nrPicioare = 4;
    private boolean esteIngrijit;

    public Caine(String nume) {
        this.nume = nume;
        this.esteIngrijit = false;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEsteIngrijit(boolean esteIngrijit) {
        this.esteIngrijit = esteIngrijit;
    }

    public String getNume() {
        return this.nume;
    }

    public int getNrPicioare() {
        return this.nrPicioare;
    }

    public boolean getEsteIngrijit() {
        return this.esteIngrijit;
    }

    @Override
    public String toString() {
        if (this.esteIngrijit) {
            return this.nume + " este ingrijit";
        } else {
            return this.nume + " nu este ingrijit";
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Caine)) {
            return false;
        }

        Caine caine = (Caine) object;

        if (this.nume.equals(caine.nume)) {
            return true;
        } else {
            return false;
        }
    }
}
