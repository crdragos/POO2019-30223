
public class Lucrator {
	private String numeLucrator;
	private CalendarLucru calendar;

	public Lucrator(String numeLucrator, CalendarLucru calendar) {
		this.numeLucrator = numeLucrator;
		this.calendar = calendar;
	}

	public String getNumeLucrator() {
		return this.numeLucrator;
	}

	public void setNumeLucrator(String numeLucrator) {
		this.numeLucrator = numeLucrator;
	}

	public CalendarLucru getCalendar() {
		return this.calendar;
	}

	public void setCalendar(CalendarLucru calendar) {
		this.calendar = calendar;
	}

	public void lucreaza(String zi) throws NonWorkingDayException {
		switch (zi) {
		case "Luni":
			if (calendar.getZile()[0].isLucratoare())
				System.out.println(numeLucrator + " lucreaza luni");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza luni");
			break;
		case "Marti":
			if (calendar.getZile()[1].isLucratoare())
				System.out.println(numeLucrator + " lucreaza marti");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza marti");
			break;
		case "Miercuri":
			if (calendar.getZile()[2].isLucratoare())
				System.out.println(numeLucrator + " lucreaza miercuri");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza miercuri");
			break;
		case "Joi":
			if (calendar.getZile()[3].isLucratoare())
				System.out.println(numeLucrator + " lucreaza joi");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza joi");
			break;
		case "Vineri":
			if (calendar.getZile()[4].isLucratoare())
				System.out.println(numeLucrator + " lucreaza vineri");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza vineri");
			break;
		case "Sambata":
			if (calendar.getZile()[5].isLucratoare())
				System.out.println(numeLucrator + " lucreaza sambata");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza sambata");
			break;
		case "Duminica":
			if (calendar.getZile()[6].isLucratoare())
				System.out.println(numeLucrator + " lucreaza duminica");
			else
				throw new NonWorkingDayException("Exceptie: " + numeLucrator + " NU lucreaza duminica");
			break;
		default:
			break;
		}

	}
}
