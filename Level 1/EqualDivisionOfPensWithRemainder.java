public class EqualDivisionOfPensWithRemainder {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int perStudent = pens / students;   // integer division
        int remainder = pens % students;    // modulus gives the leftover

        System.out.println(
            "The Pen Per Student is " + perStudent +
            " and the remaining pen not distributed is " + remainder
        );
    }
}
