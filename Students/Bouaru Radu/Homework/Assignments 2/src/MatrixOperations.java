import java.math.BigDecimal;

public class MatrixOperations {

	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b)
	{
		int rows1 = a.length;
		int cols1 = a[0].length;
		
		int rows2 = b.length;
		int cols2 = b[0].length;
		
		if(rows1 != rows2 || cols1 != cols2)
		{
			System.out.println("Addition impossible - check your matrices");
			return null;
		}
		
		BigDecimal[][] sum = new BigDecimal[rows1][cols1];
		
		for(int i=0; i<rows1; i++)
			for(int j=0; j<cols1; j++)
				sum[i][j] = a[i][j].add(b[i][j]);
		
		return sum;	
	}
	
	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b)
	{
		int rows1 = a.length;
		int cols1 = a[0].length;
		
		int rows2 = b.length;
		int cols2 = b[0].length;
		
		if(rows1 != rows2 || cols1 != cols2)
		{
			System.out.println("Subtraction impossible - check your matrices");
			return null;
		}
		
		BigDecimal[][] sum = new BigDecimal[rows1][cols1];
		
		for(int i=0; i<rows1; i++)
			for(int j=0; j<cols1; j++)
				sum[i][j] = a[i][j].subtract(b[i][j]);
		
		return sum;	
	}
	public static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b)
	{
		int rows1 = a.length;
		int cols1 = a[0].length;
		
		int rows2 = b.length;
		int cols2 = b[0].length;
		
		if(cols1 != rows2)
		{
			System.out.println("Multiplication impossible - check your matrices");
			return null;
		}
		
		BigDecimal[][] result = new BigDecimal[rows1][cols2];
		
		for(int i=0; i<rows1; i++)
			for(int j=0; j<cols2; j++)
				for(int k = 0; k<cols1; k++)
				result[i][j] = result[i][j].add(a[i][k].multiply(b[k][j]));
		
		return result;	
	}
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal b)
	{
		int rows1 = a.length;
		int cols1 = a[0].length;
		
		
		BigDecimal[][] result = new BigDecimal[rows1][cols1];
		
		for(int i=0; i<rows1; i++)
			for(int j=0; j<cols1; j++)
				result[i][j].multiply(b);
		
		return result;	
	}
	static BigDecimal m[][];
	public static BigDecimal[][] generateSubArray(BigDecimal[][] a, int n, int j1)
	{
		m = new BigDecimal[n-1][];
		for(int k = 0; k<n-1; k++)
			m[k] = new BigDecimal[n-1];
		
		for(int i=1; i<n; i++)
		{
			int j2 = 0;
			for(int j=0; j<n; j++)
			{
				if (j == j1)
					continue;
				m[i-1][j2] = a[i][j];
				j2++;
			}
		}
		return m;
	}
	public static BigDecimal det(BigDecimal[][] a, int n)
	{
		BigDecimal rez1 = new BigDecimal("1"), rez2 = new BigDecimal("1"), rez = new BigDecimal("1");
		if(a.length != a[0].length)
		{
			System.out.println("Determinant impossible to calculate");
			return null;
		}
		if(n == 1)
			rez = a[0][0];
		else if(n==2)
		{
			rez1.multiply(a[1][1]);
			rez1.multiply(a[0][0]);
			rez2.multiply(a[1][0]);
			rez2.multiply(a[0][1]);
			rez = rez1.subtract(rez2);
		}
		else
		{
			
			rez = new BigDecimal("0");
			for(int j1=0; j1<n; j1++)
			{
				m = generateSubArray(a,n,j1);
				BigDecimal pow = new BigDecimal("-1");
				BigDecimal powrez = new BigDecimal("pow.pow(1+j1+1)");
				rez.add(powrez).multiply(a[0][j1].multiply(det(m,n-1)));
			}
			
					
		}
		return rez;
	}
	public boolean areEqual(BigDecimal[][] a, BigDecimal[][] b)
	{
		int rows1 = a.length;
		int cols1 = a[0].length;
		
		int rows2 = b.length;
		int cols2 = b[0].length;
		if(rows1 != rows2 || cols1 != cols2)
			return false;
		for(int i=0; i<rows1; i++)
			for(int j=0;  j<cols1; j++)
				if(a[i][j] != b[i][j])
					return false;
		return true;
	}
	public boolean isZeroMatrix(BigDecimal[][] a)
	{
		int rows1 = a.length;
		int cols1 = a[0].length;
		for(int i=0; i<rows1; i++)
			for(int j=0; j<cols1; j++)
				if(a[i][j].intValue() != 0)
					return false;
		return true;
	}
	public boolean isIdenitityMatrix(BigDecimal[][] a)
	{
		int rows1 = a.length;
		for(int i=0; i<rows1; i++)
				if(a[i][i].intValue() != 1)
					return false;
		return true;
	}
	public BigDecimal fillDegree(BigDecimal[][] a)
	{
		BigDecimal count = new BigDecimal("0");
		BigDecimal nrelements = new BigDecimal("0");
		int rows1 = a.length;
		int cols1 = a[0].length;
		for(int i=0; i<rows1; i++)
			for(int j=0; j<cols1; j++)
			{
				if(a[i][j].intValue() != 0)
					count.add(BigDecimal.ONE);
				nrelements.add(BigDecimal.ONE);
			}
				
		return count.divide(nrelements);				
	}
}
