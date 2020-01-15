import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class TestAngajat extends TestCase {

    @Test
    public void proceseazaReteta() {
        Angajat angajat = new Angajat("Marius", 123456, new Date(2010, 02, 07), 0.0);
        Pacient pacient = new PacientAcut("pacient1", "1", 15, "masculin");
        Medicament medicament = new Medicament("Para", "para", 20.0, 50.0);
        ArrayList<Medicament> medicamenteReteta = new ArrayList<>();
        medicamenteReteta.add(medicament);
        Reteta reteta = new Reteta(medicamenteReteta, 20);
        reteta.setMedicaments(medicamenteReteta);
        angajat.proceseazaReteta(pacient);
        if (angajat.getBonusSalariu().equals(20 * 0.15)) {
            assertTrue(true);
        }
    }
}
