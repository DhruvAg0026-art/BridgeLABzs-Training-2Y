class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_C = -273.15;
    private static final double ABSOLUTE_ZERO_F = -459.67;

    public double convertTemperature(double temp, char unit) throws InvalidTemperatureException {
        if (unit == 'C') {
            if (temp < ABSOLUTE_ZERO_C) {
                throw new InvalidTemperatureException(
                    String.format("%.2f°C is below absolute zero!", temp));
            }
            return (temp * 9/5) + 32; // Convert to Fahrenheit
        } else if (unit == 'F') {
            if (temp < ABSOLUTE_ZERO_F) {
                throw new InvalidTemperatureException(
                    String.format("%.2f°F is below absolute zero!", temp));
            }
            return (temp - 32) * 5/9; // Convert to Celsius
        }
        throw new IllegalArgumentException("Invalid unit. Use 'C' or 'F'");
    }
}

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        
        try {
            // Test valid conversions
            System.out.printf("32°F = %.2f°C%n", converter.convertTemperature(32, 'F'));
            System.out.printf("100°C = %.2f°F%n", converter.convertTemperature(100, 'C'));
            
            // Test invalid temperature
            converter.convertTemperature(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}