import java.util.Comparator;

public class Persoana implements Comparable<Persoana>, Comparator<Persoana>{
	private String nume;
	private String prenume;
	private int varsta;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public int compareTo(Persoana persToCompare) {
		if(this.varsta > persToCompare.getVarsta())
			return 1;
		else
			if(this.varsta  == persToCompare.getVarsta())
				return 0;
			else
				return -1;
	}
	@Override
	public int compare(Persoana o1, Persoana o2) {
		if(o1.nume.compareTo(o2.nume) > 0)
			return 1;
		else
			if(o1.nume.compareTo(o2.nume) == 0)
				return 0;
			else
				return -1;
	}
}
