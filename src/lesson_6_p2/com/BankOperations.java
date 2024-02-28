package lesson_6_p2.com;

public interface BankOperations {

    public void addCustomer(String f, String l,Branch b) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l,b);
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }
}
