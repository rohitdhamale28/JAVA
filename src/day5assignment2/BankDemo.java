package day5assignment2;

import class1.Date;

public class BankDemo {
    public static void main(String[] args) {
        Date d = new Date();
        
        // Creating a SavingsAccount object via Account reference (Polymorphism)
        Account savings = new SavingsAccount(102, "Alice Smith", 5000.0, d);
        
        try {
            System.out.println("--- Attempting Valid Withdrawal ---");
            savings.withdraw(2000.0); // Balance becomes 3000 (Above MIN_BALANCE 1000)
            
            System.out.println("\n--- Attempting Withdrawal Violating Min Balance ---");
            savings.withdraw(2500.0); // Balance would become 500, which is < MIN_BALANCE (Throws exception)
            
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.err.println("Exception Caught: " + e.getMessage());
        }
    }
}