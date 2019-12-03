import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleMatrix extends GenericMatrix<Double>{

	@Override
	protected Double add(Double o1, Double o2) {
		return o1+o2;
	}

	@Override
	protected Double multiply(Double o1, Double o2) {
		Double result =  o1*o2;
		BigDecimal bd = new BigDecimal(result.toString());
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	@Override
	protected Double zero() {
		return 0.0;
	}

}
