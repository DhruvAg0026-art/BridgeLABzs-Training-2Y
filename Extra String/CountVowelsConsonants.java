import java.util.*;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hello World";
        s = s.toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) v++;
            else if (ch >= 'a' && ch <= 'z') c++;
        }
        System.out.println("Vowels: " + v + " Consonants: " + c);
    }
}
