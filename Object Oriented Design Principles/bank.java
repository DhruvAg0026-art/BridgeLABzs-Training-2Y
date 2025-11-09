import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private String name;
    private Map<String, Customer> customers = new HashMap<>();
    private int nextAccountId = 1001;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void openAccount(Customer customer, double initialDeposit) {
        String accId = "A" + (nextAccountId++);
        Account acc = new Account(accId, this, initialDeposit);
        customer.addAccount(acc);
        customers.putIfAbsent(customer.getId(), customer);
        System.out.println("Bank " + name + " opened account " + accId + " for " + customer.getName());
    }

    public void processTransaction(String customerId, String accountId, double amount) {
        Customer c = customers.get(customerId);
        if (c == null) {
            System.out.println("Customer not found in bank.");
            return;
        }
        for (Account a : c.getAccounts()) {
            if (a.getAccountId().equals(accountId)) {
                a.updateBalance(amount);
                System.out.printf("Processed %.2f on %s (new balance: %.2f)%n", amount, accountId, a.getBalance());
                return;
            }
        }
        System.out.println("Account not found for customer.");
    }

    public Customer getCustomer(String id) {
        return customers.get(id);
    }
}

class Customer {
    private String id;
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Account> getAccounts() { return accounts; }
    public void addAccount(Account acc) { accounts.add(acc); }

    public void viewBalances() {
        System.out.println("Balances for " + name + ":");
        if (accounts.isEmpty()) {
            System.out.println("  (no accounts)");
            return;
        }
        for (Account a : accounts) {
            System.out.printf("  %s @ %s : %.2f%n", a.getAccountId(), a.getBank().getName(), a.getBalance());
        }
    }
}

class Account {
    private String accountId;
    private Bank bank;
    private double balance;

    public Account(String accountId, Bank bank, double initialDeposit) {
        this.accountId = accountId;
        this.bank = bank;
        this.balance = initialDeposit;
    }

    public String getAccountId() { return accountId; }
    public Bank getBank() { return bank; }
    public double getBalance() { return balance; }
    public void updateBalance(double amount) { this.balance += amount; }
}

class MainBankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer alice = new Customer("C001", "Alice");
        bank.openAccount(alice, 500.0);
        bank.openAccount(alice, 1500.0);
        alice.viewBalances();
        // deposit 250 into first account (likely A1001)
        bank.processTransaction("C001", "A1001", 250.0);
        alice.viewBalances();
    }
}
