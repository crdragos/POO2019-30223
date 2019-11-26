public class Person implements Comparable{
    private String nume;
    private String prenume;
    private int varsta;

    public Person() {
        this.nume = "New";
        this.prenume = "Person";
        this.varsta = 0;
    }

    public Person(String nume, String prenume, int vasrta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = vasrta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public String toString() {
        return this.getNume() + " " + this.prenume + " " + this.getVarsta();
    }

/*
    // pentru ordonare alfabetica
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        if (this.nume.compareTo(p.nume) == 0) {
            return this.prenume.compareTo(p.prenume);
        }

        return this.nume.compareTo(p.nume);
    }
*/

    @Override
    public int compareTo(Object object) {
        Person auxPerson = (Person) object;
        if (this.varsta == auxPerson.varsta) {
            return 0;
        } else if (this.varsta > auxPerson.varsta) {
            return 1;
        } else {
            return -1;
        }
    }

}
