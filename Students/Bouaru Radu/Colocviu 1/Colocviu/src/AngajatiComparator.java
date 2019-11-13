import java.util.*;

public class AngajatiComparator implements Comparator<Angajat>{
	public int compare(Angajat a1, Angajat a2)
	{
		if(a1.getClientiServiti() == a2.getClientiServiti())
			return 0;
		else if (a1.getClientiServiti() > a2.getClientiServiti())
			return 1;
		else
			return -1;
	}

}
