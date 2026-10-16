package day5assignment2;

import class1.Date;

public class Account {
    private int accid;
    private String name;
    private double balance;
    private Date joiningdate;
    
    private static float intrate;
    
    static {
        intrate = 6.5f;
    }
    
    // Parameterized Constructor
    public Account(int accid, String name, double balance, Date joiningdate) {
        this.accid = accid;
        this.name = name;
        this.balance = balance;
        this.joiningdate = joiningdate;
    }
    
    // Deposit method with exception handling
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Error: Deposit amount must be greater than zero. Provided amount: " + amount);
        }
        balance += amount;
        System.out.println("Successfully deposited: " + amount + " | Current Balance: " + balance);
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Error: Withdrawal amount must be greater than zero. Provided amount: " + amount);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient balance. Available balance is " + balance + ", but attempted to withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: " + amount + " | Remaining Balance: " + balance);
    }

    public void calculateInstrest() {
        double intrest = (balance * intrate * 0.4);
        System.out.println("Interest: " + intrest);
    }

    
    public static void main(String[] args) {
        // Example usage and testing
        Date d = new Date(); // Assuming Date class is available
        Account acc = new Account(101, "John Doe", 5000.0, d);
        
        try {
            acc.deposit(1500.0);
            acc.withdraw(2000.0);
            
            // This will trigger InvalidAmountException
//             acc.withdraw(-500.0);
            
            // This will trigger InsufficientBalanceException
//             acc.withdraw(10000.0);
            
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}