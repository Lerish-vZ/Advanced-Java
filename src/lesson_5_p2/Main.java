package lesson_5_p2;

public class Main {
    public static void Main(String args[]){
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);
        System.out.println("Jane's withholding: " + jane.getWithholding());
        System.out.println("John's bonus " + john.getBonus());
    }
}
