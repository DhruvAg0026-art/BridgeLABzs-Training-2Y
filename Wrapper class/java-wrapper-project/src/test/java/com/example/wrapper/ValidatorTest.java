import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.wrapper.validation.Validator;

public class ValidatorTest {

    @Test
    public void testValidIntegerInput() {
        assertTrue(Validator.isValidInteger("123"));
        assertTrue(Validator.isValidInteger("0"));
        assertTrue(Validator.isValidInteger("-456"));
    }

    @Test
    public void testInvalidIntegerInput() {
        assertFalse(Validator.isValidInteger("abc"));
        assertFalse(Validator.isValidInteger("12.34"));
        assertFalse(Validator.isValidInteger(""));
    }

    @Test
    public void testValidAge() {
        assertTrue(Validator.isValidAge(18));
        assertTrue(Validator.isValidAge(25));
    }

    @Test
    public void testInvalidAge() {
        assertFalse(Validator.isValidAge(17));
        assertFalse(Validator.isValidAge(-1));
    }
}