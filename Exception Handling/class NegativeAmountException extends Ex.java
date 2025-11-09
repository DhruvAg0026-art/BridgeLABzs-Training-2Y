class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class Transaction {
    public void processTransaction(double amount) 
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        // Simulate random failure
        int randomError = (int)(Math.random() * 4);
        
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative");
        }
        
        switch (randomError) {
            case 0:
                throw new InsufficientFundsException("Insufficient funds for transaction");
            case 1:
                throw new NetworkFailureException("Network connection failed");
            case 2:
                System.out.println("Transaction successful: $" + amount);
                break;
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        try {
            transaction.processTransaction(100.00);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage() + ". Please try again later.");
        }
    }
}