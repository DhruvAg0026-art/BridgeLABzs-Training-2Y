public class InputConversionTask {
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input + ". Returning 0.");
            return 0;
        }
    }
}