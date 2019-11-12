public class Manual extends Rechizita {

    public Manual(String materie) {
        this.eticheta = materie;
    }

    @Override
    public String getName() {
        return "Manual " + eticheta;
    }
}
