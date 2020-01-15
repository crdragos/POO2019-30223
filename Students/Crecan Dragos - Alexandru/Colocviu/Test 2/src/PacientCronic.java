public class PacientCronic extends  Pacient{

    public PacientCronic(String nume, String prenume, Integer varsta, String sex) {
        super(nume, prenume, varsta, sex);
    }

    @Override
    public void calculareGradDeSeveritate() {
        this.setGradDeSeveritate(this.getReteta().getMedicaments().size() * 0.2 + 5);
    }
}
