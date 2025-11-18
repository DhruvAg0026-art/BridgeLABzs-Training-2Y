import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimitiveToWrapperTest {

    @Test
    void testPrimitiveToWrapperConversion() {
        int primitiveInt = 5;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        assertEquals(5, wrapperInt.intValue());
    }

    @Test
    void testWrapperToPrimitiveConversion() {
        Integer wrapperInt = Integer.valueOf(10);
        int primitiveInt = wrapperInt.intValue();
        assertEquals(10, primitiveInt);
    }

    @Test
    void testAutoBoxing() {
        Integer autoBoxedInt = 15; // Auto-boxing
        assertEquals(15, autoBoxedInt);
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
        assertTrue(a.equals(b)); // Value equality
        assertFalse(a == b); // Reference equality
    }

    @Test
    void testUtilityMethods() {
        String numberString = "30";
        int parsedInt = Integer.parseInt(numberString);
        assertEquals(30, parsedInt);
    }
}