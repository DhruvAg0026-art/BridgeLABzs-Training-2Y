import java.util.List;

public class WrapperUtilities {

    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for Integer: " + str);
            return null;
        }
    }

    public static Double parseStringToDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for Double: " + str);
            return null;
        }
    }

    public static Character parseStringToCharacter(String str) {
        if (str != null && str.length() == 1) {
            return str.charAt(0);
        }
        System.out.println("Invalid input for Character: " + str);
        return null;
    }

    public static void displayWrapperInfo(List<Integer> integers) {
        for (Integer integer : integers) {
            System.out.println("Wrapper Integer: " + integer + ", Primitive int: " + integer.intValue());
        }
    }
}