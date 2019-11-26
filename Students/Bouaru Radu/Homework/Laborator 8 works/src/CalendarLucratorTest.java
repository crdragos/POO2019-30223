
public class CalendarLucratorTest {
	public static void main(String[] args) {
		CalendarLucru newCalendar = new CalendarLucru();
		Lucrator newLucrator = new Lucrator("Thor", newCalendar);
		try {
			newLucrator.lucreaza("Vineri");
		} catch (NonWorkingDayException e) {
			System.err.println(e.getMessage());
		}
		try {
			newLucrator.lucreaza("Luni");
		} catch (NonWorkingDayException e) {
			System.err.println(e.getMessage());
		}
		try {
			newLucrator.lucreaza("Sambata");
		} catch (NonWorkingDayException e) {
			System.err.println(e.getMessage());
		}
	}
}
