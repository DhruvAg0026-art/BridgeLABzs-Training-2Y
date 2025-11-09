class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class OrderProcessor {
    public void placeOrder(String product) throws OutOfStockException, PaymentFailedException {
        // Simulate random failures
        int randomStatus = (int)(Math.random() * 3); // 0, 1, or 2
        
        switch (randomStatus) {
            case 0:
                throw new OutOfStockException("Product '" + product + "' is out of stock");
            case 1:
                throw new PaymentFailedException("Payment processing failed");
            case 2:
                System.out.println("Order placed successfully for: " + product);
        }
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        try {
            processor.placeOrder("Laptop");
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}