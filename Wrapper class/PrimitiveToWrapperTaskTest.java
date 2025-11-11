import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimitiveToWrapperTaskTest {

    @Test
    void testPrimitiveToWrapperConversion() {
        PrimitiveToWrapperTask task = new PrimitiveToWrapperTask();
        int primitiveInt = 5;
        Integer wrapperInt = task.convertPrimitiveToWrapper(primitiveInt);
        assertEquals(Integer.valueOf(primitiveInt), wrapperInt);
    }

    @Test
    void testWrapperToPrimitiveConversion() {
        PrimitiveToWrapperTask task = new PrimitiveToWrapperTask();
        Integer wrapperInt = 10;
        int primitiveInt = task.convertWrapperToPrimitive(wrapperInt);
        assertEquals(wrapperInt.intValue(), primitiveInt);
    }

    @Test
    void testAutoBoxing() {
        PrimitiveToWrapperTask task = new PrimitiveToWrapperTask();
        int primitiveInt = 15;
        Integer wrapperInt = task.autoBoxing(primitiveInt);
        assertEquals(Integer.valueOf(primitiveInt), wrapperInt);
    }

    @Test
    void testAutoUnboxing() {
        PrimitiveToWrapperTask task = new PrimitiveToWrapperTask();
        Integer wrapperInt = 20;
        int primitiveInt = task.autoUnboxing(wrapperInt);
        assertEquals(wrapperInt.intValue(), primitiveInt);
    }

    @Test
    void testWrapperComparison() {
        PrimitiveToWrapperTask task = new PrimitiveToWrapperTask();
        Integer wrapperInt1 = 30;
        Integer wrapperInt2 = 30;
        assertTrue(task.compareWrappers(wrapperInt1, wrapperInt2));
    }
}