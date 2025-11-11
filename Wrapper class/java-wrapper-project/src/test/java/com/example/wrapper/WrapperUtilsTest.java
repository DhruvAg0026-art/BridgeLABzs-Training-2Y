import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapperUtilsTest {

    @Test
    void testSafeParseInt_ValidInput() {
        assertEquals(123, WrapperUtils.safeParseInt("123"));
    }

    @Test
    void testSafeParseInt_InvalidInput() {
        assertThrows(NumberFormatException.class, () -> {
            WrapperUtils.safeParseInt("abc");
        });
    }

    @Test
    void testCalculateAverage() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3.0, WrapperUtils.calculateAverage(numbers));
    }

    @Test
    void testCalculateMax() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        assertEquals(5, WrapperUtils.calculateMax(numbers));
    }
}