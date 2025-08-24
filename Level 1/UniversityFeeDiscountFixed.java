public class UniversityFeeDiscountFixed {
    public static void main(String[] args) {
        double fee = 125000;          // given
        double discountPercent = 10;  // given

        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + (int) discount +
            " and final discounted fee is INR " + (int) finalFee
        );
    }
}
