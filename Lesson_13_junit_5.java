import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(120, Factorial.calculateFactorial(5));
        assertEquals(720, Factorial.calculateFactorial(6));
    }

    @Test
    public void testCalculateFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }
}
