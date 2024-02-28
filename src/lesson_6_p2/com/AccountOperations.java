package lesson_6_p2.com;

public interface AccountOperations {
    public double getBalance();
    public void deposit(double amount);
    public boolean withdraw(double amount);
    public String getDescription();
}
