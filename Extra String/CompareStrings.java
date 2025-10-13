public class CompareStrings {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        int cmp = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cmp = a.charAt(i) - b.charAt(i);
                break;
            }
        }
        if (cmp == 0) cmp = a.length() - b.length();
        if (cmp < 0) System.out.println(a + " comes before " + b);
        else if (cmp > 0) System.out.println(b + " comes before " + a);
        else System.out.println("Equal");
    }
}
