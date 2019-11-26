public class Student {
    private final String nume;
    private final String prenume;
    private Materie[] materii;

    public Student(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        this.materii = new Materie[3];
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

    public Materie getMaterie(String numeMaterie) {
        for (int i = 0; i < this.materii.length; i++) {
            if (this.materii[i].getNume().equals(numeMaterie) == true) {
                return this.materii[i];
            }
        }

        return null;
    }

    public void promoveaazaLaborator(String numeMaterie) throws ExceptiePicaLaborator {
        boolean promLab = false;
        if (this.getMaterie(numeMaterie) != null) {
            if (this.getMaterie(numeMaterie).getPromLab() == true) {
                System.out.println("A promovat laboratorul.");
            } else {
                throw new ExceptiePicaLaborator("Exceptie: nu promoveaza laboratorul...");
            }
        } else {
            System.out.println("Aceasta materie nu este studiata de catre student...");
        }
    }

    public void promoveazaMatrie(String numeMaterie) throws ExceptiePicaMaterie, ExceptiePicaLaborator {
        try {
            if (this.getMaterie(numeMaterie) != null) {
                this.promoveaazaLaborator(numeMaterie);
            } else {
                System.out.println("Aceasta materie nu este studiata de catre student...");
            }
        } catch (ExceptiePicaLaborator exceptiePicaLaborator) {
            exceptiePicaLaborator.printStackTrace();
            throw new ExceptiePicaMaterie("Exceptie : nu a promovat materia...");
        } finally {
            if (this.getMaterie(numeMaterie).getPromMaterie() == true) {
                System.out.println("A promovat materia!");
            } else {
                throw new ExceptiePicaMaterie("Exceptie : nu a promovat materia...");
            }
        }
    }

}
