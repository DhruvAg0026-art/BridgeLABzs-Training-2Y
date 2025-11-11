import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapperTasksTest {

    @Test
    void testPrimitiveToWrapper() {
        int primitiveInt = 5;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        assertEquals(primitiveInt, wrapperInt.intValue());
    }

    @Test
    void testWrapperToPrimitive() {
        Double wrapperDouble = Double.valueOf(10.5);
        double primitiveDouble = wrapperDouble.doubleValue();
        assertEquals(wrapperDouble, primitiveDouble);
    }

    @Test
    void testAutoBoxing() {
        Integer autoBoxedInt = 10; // Auto-boxing
        assertEquals(10, autoBoxedInt);
    }

    @Test
    void testAutoUnboxing() {
        Integer wrapperInt = Integer.valueOf(20);
        int autoUnboxedInt = wrapperInt; // Auto-unboxing
        assertEquals(20, autoUnboxedInt);
    }

    @Test
    void testWrapperComparison() {
        Integer a = 1000;
        Integer b = 1000;
        assertNotSame(a, b); // Different objects
        assertEquals(a, b); // Same value
    }

    @Test
    void testUtilityMethods() {
        assertEquals(5, Integer.compare(5, 10));
        assertTrue(Character.isDigit('5'));
    }

    @Test
    void testInputConversion() {
        String validInput = "123";
        String invalidInput = "abc";
        assertEquals(123, safeParseInt(validInput));
        assertThrows(NumberFormatException.class, () -> safeParseInt(invalidInput));
    }

    private int safeParseInt(String input) {
        return Integer.parseInt(input);
    }

    // Additional tests for other tasks can be added here
}