import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.wrapper.converters.PrimitiveConverter;

public class PrimitiveConverterTest {

    private PrimitiveConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new PrimitiveConverter();
    }

    @Test
    public void testConvertIntToInteger() {
        int primitiveInt = 5;
        Integer expectedInteger = 5;
        Integer actualInteger = converter.convertIntToInteger(primitiveInt);
        assertEquals(expectedInteger, actualInteger);
    }

    @Test
    public void testConvertIntegerToInt() {
        Integer wrapperInt = 10;
        int expectedPrimitiveInt = 10;
        int actualPrimitiveInt = converter.convertIntegerToInt(wrapperInt);
        assertEquals(expectedPrimitiveInt, actualPrimitiveInt);
    }

    @Test
    public void testConvertDoubleToPrimitive() {
        Double wrapperDouble = 15.5;
        double expectedPrimitiveDouble = 15.5;
        double actualPrimitiveDouble = converter.convertDoubleToPrimitive(wrapperDouble);
        assertEquals(expectedPrimitiveDouble, actualPrimitiveDouble);
    }

    @Test
    public void testConvertPrimitiveToDouble() {
        double primitiveDouble = 20.0;
        Double expectedWrapperDouble = 20.0;
        Double actualWrapperDouble = converter.convertPrimitiveToDouble(primitiveDouble);
        assertEquals(expectedWrapperDouble, actualWrapperDouble);
    }

    @Test
    public void testConvertNullIntegerToInt() {
        Integer nullInteger = null;
        assertThrows(NullPointerException.class, () -> {
            converter.convertIntegerToInt(nullInteger);
        });
    }

    @Test
    public void testConvertNullDoubleToPrimitive() {
        Double nullDouble = null;
        assertThrows(NullPointerException.class, () -> {
            converter.convertDoubleToPrimitive(nullDouble);
        });
    }
}