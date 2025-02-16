import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        Assert.assertEquals(Factorial.calculateFactorial(0), 1);
        Assert.assertEquals(Factorial.calculateFactorial(1), 1);
        Assert.assertEquals(Factorial.calculateFactorial(5), 120);
        Assert.assertEquals(Factorial.calculateFactorial(6), 720);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Number must be non-negative")
    public void testCalculateFactorialNegative() {
        Factorial.calculateFactorial(-1);
    }
}
