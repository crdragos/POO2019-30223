
public class Polynomial {
	// Consideram polinomul sub forma
	// a[n] * x ^ n + a[n-1] * x ^ ( n-1) + .. + a[1] x + a[0]
	private int degree; // gradul polinomului
	private int[] coefficients; // coeficientii polinomului

	// Gradul polinomului

	// Constructor pentru polinom dintr-un sir de numere
	public Polynomial(int c[]) {
		coefficients = new int[c.length + 1];
		for (int i = 0; i < c.length; i++)
			coefficients[i] = c[c.length - i - 1];
		degree = getDegree();
	}

	// Constructor pentru polinom de grad d, cu un singur termen
	public Polynomial(int d, int term) {
		coefficients = new int[d + 1];
		coefficients[d] = term;
		degree = getDegree();
	}

	// Constructor pentru copierea polinamelor
	public Polynomial(Polynomial p) {
		coefficients = new int[p.coefficients.length];
		for (int i = 0; i < p.coefficients.length; i++)
			coefficients[i] = p.coefficients[i];
		degree = p.degree;
	}

	public int getDegree() {
		int grad = 0;
		for (int i = 0; i < coefficients.length; i++)
			if (coefficients[i] != 0)
				grad = i;
		return grad;
	}
	public int getCoefficients(int i) {
		return coefficients[i];
	}

	public Polynomial add(Polynomial p) {
		Polynomial x = this;
		Polynomial sum = new Polynomial(Math.max(x.degree, p.degree), 0);

		for (int i = 0; i <= x.degree; i++)
			sum.coefficients[i] += x.coefficients[i];

		for (int i = 0; i <= p.degree; i++)
			sum.coefficients[i] += p.coefficients[i];

		sum.degree = sum.getDegree();
		return sum;
	}

	public Polynomial subtract(Polynomial p) {
		Polynomial x = this;
		Polynomial diff = new Polynomial(Math.max(x.degree, p.degree), 0);

		for (int i = 0; i <= x.degree; i++)
			diff.coefficients[i] += x.coefficients[i];

		for (int i = 0; i <= p.degree; i++)
			diff.coefficients[i] -= p.coefficients[i];

		diff.degree = diff.getDegree();
		return diff;
	}

	public Polynomial multiply(Polynomial p) {
		Polynomial x = this;
		int new_degree = x.degree + p.degree;
		Polynomial product = new Polynomial(new_degree, 0);

		for (int i = 0; i <= x.degree; i++)
			for (int j = 0; j <= p.degree; j++)
				product.coefficients[i + j] += (x.coefficients[i] * p.coefficients[j]);

		product.degree = product.getDegree();
		return product;

	}
	public Polynomial mul_scal(int scalar)
	{
		Polynomial zero = new Polynomial(0,0);
		Polynomial x = new Polynomial(this.degree, 0);
		if(scalar == 0)
			return zero;
		
		for(int i = 0; i <= this.degree; i++)
			x.coefficients[i] = this.coefficients[i]*scalar;
		x.degree = x.getDegree();
		return x;
	}
	public double eval(double n)
	{
		double result = 0;
		for(int i=0; i<= this.degree; i++)
			result += (coefficients[i] * Math.pow(n, (double)(i)));
		
		return result;
	}
	public boolean isZero(Polynomial p)
	{
		for(int i=0; i<p.degree; i++)
			if(p.coefficients[i] != 0)
				return false;
		return true;
	}
    public int coeff(){return coeff( getDegree() ); }
    // get the coefficient for degree d

    public int coeff( int degree ){

        if( degree > this.getDegree() ) throw new RuntimeException( "bad degree" );

        return coefficients[degree];

    }
	//Algoritmul de impartire al polinoamelor de pe Wikipedia
	public Polynomial[] division(Polynomial p)
	{
		Polynomial r = new Polynomial(this);
		Polynomial q = new Polynomial(0,0);
		while(!isZero(r) && r.getDegree() >= p.getDegree())
		{
			int coef = r.coeff() / p.coeff();
			int gr = r.getDegree() / p.getDegree();
			Polynomial t = new Polynomial(gr, coef);
			q = q.add(t);
			r = r.subtract(t.multiply(p));
		}
		System.out.printf( "(%s) / (%s): %s, %s", this, p, q, r );
        return new Polynomial[]{ q, r };
	}
	public String toString() {
		if (degree == 0)
			return "" + coefficients[0];
		if (degree == 1)
			if(coefficients[1] == 1)
			return  "x + " + coefficients[0];
			else
				if(coefficients[1] == -1)
					return "-x + " + coefficients[0];
				else
					return coefficients[1] + "x + " + coefficients[0];

		String poly = "";

		if (coefficients[degree] == 1)
			poly = "x^" + degree;
		else if (coefficients[degree] == -1)
			poly = "-x^" + degree;
		else
			poly = coefficients[degree] + "x^" + degree;

		for (int i = degree - 1; i >= 0; i--) {
			if (coefficients[i] == 0)
				continue;
			else if (coefficients[i] == 1)
				poly = poly + " + 1";
			else if (coefficients[i] == -1)
				poly = poly + " - 1";
			else if (coefficients[i] > 0)
				poly = poly + " + " + coefficients[i];
			else if (coefficients[i] < 0)
				poly = poly + " - " + (-coefficients[i]);

			if (i == 1)
				poly = poly + "x";
			else if (i > 1)
				poly = poly + "x^" + i;
		}
		return poly;
	}
}
