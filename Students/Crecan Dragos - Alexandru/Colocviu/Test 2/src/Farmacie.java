import java.util.ArrayList;
import java.util.HashMap;

public class Farmacie {

    private HashMap<Integer, Medicament> medicamente;
    private HashMap<Integer, Angajat> angajati;
    private ArrayList<Angajat> listaAngajati;
    private String denumire;
    private String adresa;
    private String numarDeTelefon;
    private String webSite;

    public Farmacie(String denumire, String adresa, String numarDeTelefon, String webSite) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.numarDeTelefon = numarDeTelefon;
        this.webSite = webSite;
        this.medicamente = new HashMap<Integer, Medicament>();
        this.angajati = new HashMap<Integer, Angajat>();
        this.listaAngajati = new ArrayList<Angajat>();
    }

    public HashMap<Integer, Medicament> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(HashMap<Integer, Medicament> medicamente) {
        this.medicamente = medicamente;
    }

    public HashMap<Integer, Angajat> getAngajat() {
        return angajati;
    }

    public void setAngajat(HashMap<Integer, Angajat> angajati) {
        this.angajati = angajati;
    }

    public ArrayList<Angajat> getListaAngajati() {
        return listaAngajati;
    }

    public void setListaAngajati(ArrayList<Angajat> listaAngajati) {
        this.listaAngajati = listaAngajati;
    }
}
