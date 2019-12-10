import java.util.ArrayList;

public class PetHotel {
    private String nume;
    private int capacitate;
    private ArrayList<Caine> caini;

    public PetHotel(String nume, int capacitate) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.caini = new ArrayList<Caine>();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void  setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setCaini(ArrayList<Caine> caini) {
        this.caini = caini;
    }

    public String getNume() {
        return this.nume;
    }

    public int getCapacitate() {
        return this.capacitate;
    }

    public ArrayList<Caine> getCaini() {
        return this.caini;
    }

    public void cazeaza(Caine caine) {
        if (this.capacitate >= this.caini.toArray().length + 1) {
            this.caini.add(caine);
            System.out.println(caine.getNume() + " a fost cazat.");
        } else {
            System.err.println("Hotel plin!");
        }
    }

    public void decazeaza(Caine caine) {
        if (this.caini.contains(caine)) {
            this.caini.remove(caine);
            System.out.println(caine.getNume() + " a fost decazat.");
        } else {
            System.out.println(caine.getNume() + " nu este cazat in hotelul " + this.nume);
        }
    }

    public void ingrijesteCaini() {
        for (Caine caine : caini) {
            caine.setEsteIngrijit(true);
        }
    }

    public void printCaini() {
        System.out.println("Cainii din hotel sunt : ");
        for (Caine caine : caini) {
            System.out.println(caine.toString());
        }
        System.out.println();
    }
}
