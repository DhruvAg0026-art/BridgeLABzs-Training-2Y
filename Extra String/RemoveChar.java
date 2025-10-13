public class RemoveChar {
    public static void main(String[] args) {
        String s = "Hello World";
        char rem = 'l';
        String res = "";
        for (char ch : s.toCharArray()) {
            if (ch != rem) res += ch;
        }
        System.out.println("Modified String: " + res);
    }
}
