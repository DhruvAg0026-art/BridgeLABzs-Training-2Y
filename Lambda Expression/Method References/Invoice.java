package MethodReferences;

public class Invoice {
    String transactionID;

    public Invoice(String transactionID) {
        this.transactionID = transactionID;
    }

    public String toString() {
        return "Invoice for Transaction: " + transactionID;
    }
}
