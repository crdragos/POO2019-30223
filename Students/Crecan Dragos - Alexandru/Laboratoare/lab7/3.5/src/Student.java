public class Student implements Cloneable {
    private final String nume;
    private final String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public Masina getMasina() {
        return this.masina;
    }

    @Override
    public String toString() {
        return "Studentul " + this.getNume() + " " + this.prenume + " are o " + this.masina.toString();
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student studentClone = (Student) super.clone();
        studentClone.masina = masina.clone();

        return studentClone;
    }

}
