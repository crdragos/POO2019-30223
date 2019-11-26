public class MainClass {
    public static void main(String[] args) throws Exception {
        CalendarLucru calendarLucru = new CalendarLucru();
        Lucrator dorel = new Lucrator("Dorel", calendarLucru);

        try {
            dorel.lucreaza("Luni");
            dorel.lucreaza("Marte");
            dorel.lucreaza("duminica");
        } catch (ExceptieZiNelucratoare exceptieZiNelucratoare) {
            System.out.println(exceptieZiNelucratoare.getMessage());
        } finally {
            dorel.lucreaza("miercuri");
            dorel.lucreaza("Marti");
        }
    }
}
