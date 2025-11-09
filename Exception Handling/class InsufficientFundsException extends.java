class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private double balance;
    
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: Current balance is ₹" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);
        try {
            atm.withdraw(15000); // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}