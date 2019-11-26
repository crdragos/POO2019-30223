public class Student {
    private final String nume;
    private final String prenume;
    private Materie[] materii;
    private float media;

    public Student(String nume, String prenume, Materie[] materii) {
        this.nume = nume;
        this.prenume = prenume;
        this.materii = materii;
        this.media = 0;
    }

    public void setMaterii(Materie[] materii) {
        this.materii = materii;
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public Materie[] getMaterii() {
        return this.materii;
    }

    public Materie getMaterie(String numeMaterie) {
        for (int i = 0; i < this.materii.length; i++) {
            if (this.materii[i].getNume().equals(numeMaterie) == true) {
                return this.materii[i];
            }
        }

        return null;
    }

    public float calculeazaMedia() {
        float sumaNote = 0;
        int numarMaterii = this.materii.length;
        for (int i = 0; i < numarMaterii; i++) {
            sumaNote += this.materii[i].getNota();
        }

        return sumaNote / numarMaterii;
    }

    public void trece(String numeMaterie) throws ExceptiePica {
        if (this.getMaterie(numeMaterie) != null) {
            if (this.getMaterie(numeMaterie).getPromovat() == true) {
                System.out.println("Studentul " + this.getNume() + " " + this.getPrenume() + " trece la " + numeMaterie);
            } else {
                throw new ExceptiePica("Exceptie : materie la care pica...");
            }
        } else {
            System.out.println(numeMaterie + " nu este o materie studiata de catre " + this.getNume() + " " + this.getPrenume());
        }
    }

    @Override
    public String toString() {
        return "Student : " + this.getNume() + " " + this.prenume + " media : " + this.calculeazaMedia();
    }
}
