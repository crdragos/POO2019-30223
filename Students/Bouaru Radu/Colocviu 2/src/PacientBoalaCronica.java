
public class PacientBoalaCronica extends Pacient {

	private String boalaCronica;
	private Double gradSeveritate;

	public PacientBoalaCronica(String nume, String prenume, Integer varsta, char sex, Double gradSeveritate,
			String boala) {
		super(nume, prenume, varsta, sex, null);
		this.gradSeveritate = gradSeveritate;
		this.boalaCronica = boala;
	}
}
