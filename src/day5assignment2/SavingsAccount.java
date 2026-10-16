package day5assignment2;

import class1.Date;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000.0;
    
    public SavingsAccount(int accid, String name, double balance, Date joiningdate) {
        super(accid, name, balance, joiningdate);
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        // Reuse validation from parent or add custom savings checks
        if (amount <= 0) {
            throw new InvalidAmountException("Error: Savings withdrawal amount must be greater than zero. Provided: " + amount);
        }
        
        // Check if withdrawal leaves balance below minimum requirement
        if ((getBalance() - amount) < MIN_BALANCE) {
            throw new InsufficientBalanceException(
                "Error: Minimum balance of " + MIN_BALANCE + " must be maintained. Current balance: " + getBalance()
            );
        }

        // If checks pass, perform withdrawal by calling parent's logic or modifying balance using setter
        super.withdraw(amount); 
    }
}