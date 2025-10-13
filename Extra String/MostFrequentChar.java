public class MostFrequentChar {
    public static void main(String[] args) {
        String s = "success";
        int max = 0;
        char mf = ' ';
        for (char ch : s.toCharArray()) {
            int freq = 0;
            for (char d : s.toCharArray()) {
                if (d == ch) freq++;
            }
            if (freq > max) {
                max = freq;
                mf = ch;
            }
        }
        System.out.println("Most Frequent Character: " + mf);
    }
}
