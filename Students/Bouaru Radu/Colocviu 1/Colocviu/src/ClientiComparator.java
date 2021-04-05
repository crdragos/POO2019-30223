import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class ClientiComparator implements Comparator<Client>{
	public int compare(Client c1, Client c2)
	{
		SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = newFormat.parse(c1.getDataCheckIn());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = newFormat.parse(c1.getDataCheckOut());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		Date date3 = null;
		try {
			date3 = newFormat.parse(c2.getDataCheckIn());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		Date date4 = null;
		try {
			date4 = newFormat.parse(c2.getDataCheckOut());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		long dateDifference1 = date2.getTime() - date1.getTime();
		long dateDifference2 = date4.getTime() - date3.getTime();
		long daysDifference1 = TimeUnit.DAYS.convert(dateDifference1, TimeUnit.MILLISECONDS);
		long daysDifference2 = TimeUnit.DAYS.convert(dateDifference2, TimeUnit.MILLISECONDS);
		if(daysDifference1 == daysDifference2)
			return 0;
		else
			if(daysDifference1 > daysDifference2)
				return 1;
			else
				return -1;
	}

}
