import java.awt.Color;

public class Autovehicul extends CompanieTransportPublic{
	private static final boolean faruri = true;
	
	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int treaptaCurenta;
	private int vitezaMaxima;
	private Sofer driver;
	
	protected Autovehicul() {
		this.marca = "Mercedes Benz";
		this.culoare = Color.black;
		this.vitezaCurenta = 0;
		this.treaptaCurenta = 0;
		this.vitezaMaxima = 320;
		this.driver = new Sofer();
	}

	protected Autovehicul(String marca, Color culoare, int vitezaCurenta, int treaptaCurenta, int vitezaMaxima) {
		this.marca = marca;
		this.culoare = culoare;
		this.vitezaCurenta = vitezaCurenta;
		this.treaptaCurenta = treaptaCurenta;
		this.vitezaMaxima = vitezaMaxima;
	}

	public void schimbaViteza() {
		if (this.vitezaCurenta > 0 && this.vitezaCurenta <= 10)
			this.treaptaCurenta = 1;
		else if (this.vitezaCurenta <= 25)
			this.treaptaCurenta = 2;
		else if (this.vitezaCurenta <= 50)
			this.treaptaCurenta = 3;
		else if (this.vitezaCurenta <= 70)
			this.treaptaCurenta = 4;
		else if (this.vitezaCurenta <= 90)
			this.treaptaCurenta = 5;
		else
			this.treaptaCurenta = 6;
	}

	public void accelerare(int vitezaNoua) {
		if (this.vitezaCurenta + vitezaNoua < this.vitezaMaxima) {
			this.vitezaCurenta += vitezaNoua;
		} else {
			this.vitezaCurenta = this.vitezaMaxima;
		}

		schimbaViteza();
	}
	
	public void accelerare(double vitezaNoua) {
		if (this.vitezaCurenta + vitezaNoua < this.vitezaMaxima) {
			this.vitezaCurenta += vitezaNoua;
		} else {
			this.vitezaCurenta = this.vitezaMaxima;
		}
		schimbaViteza();
	}
	
	public void decelerare(int vitezaNoua) {
		if (this.vitezaCurenta - vitezaNoua > 0) {
			this.vitezaCurenta -= vitezaNoua;
		} else {
			this.vitezaCurenta = 0;
		}
		schimbaViteza();

	}

	public void oprire() {
		this.vitezaCurenta = 0;
		this.treaptaCurenta = 0;
	}

	public int getVitezaCurenta() {
		return this.vitezaCurenta;
	}
	
	public int getTreaptaCurenta() {
		return this.treaptaCurenta;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}

	public Color getCuloare() {
		return this.culoare;
	}

	public void setCuloare(Color newColor) {
		this.culoare = newColor;
	}

	public void setVitezaMaxima(int maxViteza) {
		this.vitezaMaxima = maxViteza;
	}

	public int getVitezaMaxima() {
		return this.vitezaMaxima;
	}
	public String getNumeSofer()
	{
		return driver.getNume() + " " + driver.getPrenume();
	}
}
