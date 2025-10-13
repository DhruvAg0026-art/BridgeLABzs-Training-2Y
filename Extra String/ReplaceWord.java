public class ReplaceWord {
    public static void main(String[] args) {
        String s = "I love Java programming";
        String word = "Java";
        String rep = "Python";
        String res = s.replace(word, rep);
        System.out.println("Modified: " + res);
    }
}
