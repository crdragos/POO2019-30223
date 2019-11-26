public class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        this.zile = new Zi[31];
        for (int i = 0; i < zile.length; i++) {
            if (i % 7 == 0) {
                zile[i] = new Zi("Luni", true);
            } else if (i % 7 == 1) {
                zile[i] = new Zi("Marti", true);
            } else if (i % 7 == 2) {
                zile[i] = new Zi("Miercuri", true);
            } else if (i % 7 == 3) {
                zile[i] = new Zi("Joi", true);
            } else if (i % 7 == 4) {
                zile[i] = new Zi("Vineri", true);
            } else if (i % 7 == 5) {
                zile[i] = new Zi("Sambata", false);
            } else {
                zile[i] = new Zi("Duminica", false);
            }
        }
    }

    public void printZile() {
        for (int i = 0; i < this.zile.length; i++) {
            System.out.println(this.zile[i].toString());
        }
    }
}
