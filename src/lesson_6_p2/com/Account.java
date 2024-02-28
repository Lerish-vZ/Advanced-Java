package lesson_6_p2.com;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }
    
}