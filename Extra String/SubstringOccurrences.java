public class SubstringOccurrences {
    public static void main(String[] args) {
        String s = "abababa";
        String sub = "aba";
        int count = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            if (s.substring(i, i + sub.length()).equals(sub)) count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
