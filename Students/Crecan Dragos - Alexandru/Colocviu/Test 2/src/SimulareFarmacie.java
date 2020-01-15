import java.util.*;

public class SimulareFarmacie {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Denumire", "Adresa", "0752269967", "http://www.farmDenumire.ro");

        HashMap<Integer, Medicament> medicamente = new HashMap<>();
        Medicament paracetamol = new Medicament("Paracetamol", "producator1", 19.5, 50.0);
        Medicament nurofen = new Medicament("Nurofen", "producator2", 15.5, 100.0);
        Medicament parasinus = new Medicament("Parasinus", "producator3", 25.5, 100.0);

        medicamente.put(5, paracetamol);
        medicamente.put(3, nurofen);
        medicamente.put(7, parasinus);

        farmacie.setMedicamente(medicamente);

        ArrayList<Angajat> angajatFarmacie = new ArrayList<>();
        Angajat angajat1 = new Angajat("Ion", 1254, new Date(2020, 05, 05), 0.0);
        Angajat angajat2 = new Angajat("Maria", 1244, new Date(2019, 07, 07), 0.0);
        Angajat angajat3 = new Angajat("Falviu", 1154, new Date(2017, 01, 22), 0.0);
        Angajat angajat4 = new Angajat("Razvan", 12566, new Date(2018, 11, 21), 0.0);

        angajatFarmacie.add(angajat1);
        angajatFarmacie.add(angajat2);
        angajatFarmacie.add(angajat3);
        angajatFarmacie.add(angajat4);

        farmacie.setListaAngajati(angajatFarmacie);

        HashMap<Integer, Angajat> angajatiRetete = new HashMap<>();
        for (int i = 0; i < angajatFarmacie.size(); i++) {
            int randomInt = (int) Math.random() % 10;
            angajatiRetete.put(randomInt, angajatFarmacie.get(i));
        }

        farmacie.setAngajat(angajatiRetete);

        ArrayList<Medicament> medicamenteReteta = new ArrayList<>();
        medicamenteReteta.add(paracetamol);

        Reteta reteta = new Reteta(medicamenteReteta, 20);
        PacientAcut pacientAcut = new PacientAcut("Pacient", "1", 15, "Masculin");
        pacientAcut.setReteta(reteta);
        pacientAcut.calculareGradDeSeveritate();

        farmacie.getListaAngajati().get(1).proceseazaReteta(pacientAcut);

    }
}
