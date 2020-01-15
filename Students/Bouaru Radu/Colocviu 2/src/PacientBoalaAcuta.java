
public class PacientBoalaAcuta extends Pacient {

	private String boalaAcuta;
	private Double gradSeveritate;

	public PacientBoalaAcuta(String nume, String prenume, Integer varsta, char sex, Double gradSeveritate,
			String boala) {
		super(nume, prenume, varsta, sex, null);
		this.gradSeveritate = gradSeveritate;
		this.boalaAcuta = boala;
	}
}
