public class Lucrator {
    private final String nume;
    private CalendarLucru calendarLucru;

    public Lucrator(String nume, CalendarLucru calendarLucru) {
        this.nume = nume;
        this.calendarLucru = calendarLucru;
    }

    public void setCalendarLucru(CalendarLucru calendarLucru) {
        this.calendarLucru = calendarLucru;
    }

    public String getNume() {
        return this.nume;
    }

    public CalendarLucru getCalendarLucru() {
        return this.calendarLucru;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare {
        if (zi.equals("Luni") == true || zi.equals("luni") == true) {
            System.out.println(this.getNume() + " lucreza " + zi + " .");
        } else if (zi.equals("Marti") == true || zi.equals("marti") == true) {
            System.out.println(this.getNume() + " lucreza " + zi + " .");
        } else if(zi.equals("Miercuri") || zi.equals("miercuri") == true) {
            System.out.println(this.getNume() + " lucreza " + zi + " .");
        } else if (zi.equals("Joi") == true || zi.equals("joi") == true) {
            System.out.println(this.getNume() + " lucreza " + zi + " .");
        } else if (zi.equals("Vineri") == true || zi.equals("vineri") == true) {
            System.out.println(this.getNume() + " lucreza " + zi + " .");
        } else if (zi.equals("Sambata") == true|| zi.equals("sambata") == true) {
            throw new ExceptieZiNelucratoare("Exceptie : lucru in zi nelucartoare.");
        } else if (zi.equals("Duminica") == true || zi.equals("duminica") == true) {
            throw new ExceptieZiNelucratoare("Exceptie : lucru in zi nelucratoare.");
        } else {
            System.out.println(zi + " nu este o zi a saptamanii...");
        }
    }
}
