package ScientificCalculator;


import org.junit.*;

import static org.junit.Assert.*;

public class DevOpsCalculatorTest {
    private DevOpsCalculator calculator;

    @Before
    public void setUp() {
        calculator = new DevOpsCalculator();
    }

    @Test
    public void testSquareRootTruePositive() {
        System.out.print("\n\nTesting Square Root For True Positive");
        double a = 25.0;
        double expectedResult = 5.0;
        double result = calculator.SquareRoot(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testSquareRootFalsePositive() {
        System.out.print("\n\nTesting Square Root For False Positive");
        double a = 25.0;
        double expectedResult = 6.0;
        double result = calculator.SquareRoot(a);
        Assert.assertNotEquals(expectedResult, result, 0);
    }

    @Test
    public void testFactorialTruePositive() {
        System.out.print("\n\nTesting Factorial For True Positive");
        double a = 4.0;
        double expectedResult = 24.0;
        double result = calculator.Factorial(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testFactorialFalsePositive() {
        System.out.print("\n\nTesting Factorial For False Positive");
        double a = 4.0;
        double expectedResult = 23.0;
        double result = calculator.Factorial(a);
        Assert.assertNotEquals("hello",expectedResult, result, 0);
    }


    @Test
    public void testNaturalLogTruePositive() {
        System.out.print("\n\nTesting Natural Log For True Positive");
        double a = 1.0;
        double expectedResult = 0.0;
        double result = calculator.NaturalLog(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testNaturalLogFalsePositive() {
        System.out.print("\n\nTesting Natural Log For False Positive");
        double a = 1.0;
        double expectedResult = 10.0;
        double result = calculator.NaturalLog(a);
        Assert.assertNotEquals(expectedResult, result, 0);
    }

    @Test
    public void testPowerFunctionTruePositive() {
        System.out.print("\n\nTesting Power Function For True Positive");
        double a = 2.0;
        double b = 4.0;
        double expectedResult = 16.0;
        double result = calculator.Power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    public void testPowerFunctionFalsePositive() {
        System.out.print("\n\nTesting Power Function For False Positive\n\n");
        double a = 2.0;
        double b = 4.0;
        double expectedResult = 32.0;
        double result = calculator.Power(a,b);
        Assert.assertNotEquals(expectedResult, result, 0.0001);
    }



}
