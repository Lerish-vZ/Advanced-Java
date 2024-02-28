package lesson_6_p2.com;

public class Bank implements BankOperations {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l,Branch b) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l,b);
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

}