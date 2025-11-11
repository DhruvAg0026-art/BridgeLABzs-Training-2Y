package com.example.wrapper;

public class BankTransactionLimitsTask {
    private static final double WITHDRAWAL_LIMIT = 1000.0;

    public static void main(String[] args) {
        Double currentBalance = 500.0;
        Double withdrawalAmount = 200.0;

        double remainingLimit = calculateRemainingLimit(currentBalance, withdrawalAmount);
        System.out.println("Remaining withdrawal limit: " + remainingLimit);
    }

    public static double calculateRemainingLimit(Double currentBalance, Double withdrawalAmount) {
        if (currentBalance == null || withdrawalAmount == null) {
            return WITHDRAWAL_LIMIT;
        }
        return WITHDRAWAL_LIMIT - withdrawalAmount;
    }
}