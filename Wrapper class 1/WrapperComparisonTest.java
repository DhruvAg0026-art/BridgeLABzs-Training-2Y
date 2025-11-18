import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapperComparisonTest {

    @Test
    void testIntegerComparison() {
        Integer a = 100;
        Integer b = 100;
        Integer c = new Integer(100);
        Integer d = 200;

        // Testing value equality
        assertEquals(a, b);
        assertEquals(a, c);
        assertNotEquals(a, d);

        // Testing reference equality
        assertSame(a, b); // This will fail due to Integer caching for values between -128 and 127
        assertNotSame(a, c);
    }

    @Test
    void testDoubleComparison() {
        Double x = 10.0;
        Double y = 10.0;
        Double z = new Double(10.0);
        Double w = 20.0;

        // Testing value equality
        assertEquals(x, y);
        assertEquals(x, z);
        assertNotEquals(x, w);

        // Testing reference equality
        assertNotSame(x, y);
        assertNotSame(x, z);
    }

    @Test
    void testBooleanComparison() {
        Boolean trueValue = true;
        Boolean falseValue = false;
        Boolean anotherTrueValue = Boolean.valueOf(true);

        // Testing value equality
        assertEquals(trueValue, anotherTrueValue);
        assertNotEquals(trueValue, falseValue);

        // Testing reference equality
        assertSame(trueValue, anotherTrueValue); // This will pass as Boolean caches true/false
    }
}