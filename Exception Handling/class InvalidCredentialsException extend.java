class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class LoginValidator {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";
    
    public void validate(String username, String password) throws InvalidCredentialsException {
        if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
        System.out.println("Login successful!");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        LoginValidator validator = new LoginValidator();
        try {
            validator.validate("admin", "wrongpassword");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
            System.out.println("Please try again.");
        }
    }
}