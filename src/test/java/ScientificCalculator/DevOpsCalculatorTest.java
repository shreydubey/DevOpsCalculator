package ScientificCalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class DevOpsCalculatorTest {
    private DevOpsCalculator calculator;

    @Before
    public void setUp() {
        calculator = new DevOpsCalculator();
    }

    @Test
    public void testSquareRoot() {
        double a = 25.0;
        double expectedResult = 5.0;
        double result = calculator.SquareRoot(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testFactorial() {
        double a = 4.0;
        double expectedResult = 24.0;
        double result = calculator.Factorial(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testNaturalLog() {
        double a = 1.0;
        double expectedResult = 0.0;
        double result = calculator.NaturalLog(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testPowerFunction() {
        double a = 2.0;
        double b = 4.0;
        double expectedResult = 16.0;
        double result = calculator.Power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0001);
    }

}
