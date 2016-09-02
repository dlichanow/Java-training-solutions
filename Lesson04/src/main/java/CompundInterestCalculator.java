import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by rb22172 on 2016-07-25.
 */
public class CompundInterestCalculator {
    final static BigDecimal PRINCIPALSUM = new BigDecimal("1500");
    final static BigDecimal NOMINALINTERESTRATE = new BigDecimal("0.043");
    final static BigDecimal COMPOUNDINGFREQUENCY = new BigDecimal("0.5");
    final static BigDecimal NUMBEROFYEAR = new BigDecimal("6");

    public static void main(String[] args) {
        System.out.println(getAccumulatedValue(PRINCIPALSUM, NOMINALINTERESTRATE, COMPOUNDINGFREQUENCY, NUMBEROFYEAR));

    }

    private static BigDecimal getAccumulatedValue(BigDecimal principalSum, BigDecimal nominalInterestRate, BigDecimal compoundingFrequency, BigDecimal numberOfYear) {

        BigDecimal dividedValue = nominalInterestRate.divide(compoundingFrequency);
        BigDecimal insideValue = dividedValue.add(new BigDecimal("1"));
        BigDecimal powMPValue = compoundingFrequency.multiply(numberOfYear);
        BigDecimal powValue = insideValue.pow(powMPValue.intValue());

        BigDecimal accumulatedValue = principalSum.multiply(powValue, new MathContext(7, RoundingMode.UP));

        return accumulatedValue;
    }


}
