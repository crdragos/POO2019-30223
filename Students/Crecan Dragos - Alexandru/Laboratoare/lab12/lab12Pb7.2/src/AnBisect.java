public class AnBisect {
    private int an;

    public AnBisect (int an) {
        this.an = an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getAn() {
        return this.an;
    }

    public static boolean esteAnBisect(int an) {
        if (an % 4 == 0 && an % 100 != 0) {
            return true;
        }

        if (an % 400 == 0) {
            return true;
        }

        return false;
    }
}
