public class Caiet extends Rechizita {

    public Caiet(String materie) {
        this.eticheta = materie;
    }

    @Override
    public String getName() {
        return "Caiet " + eticheta;
    }
}
