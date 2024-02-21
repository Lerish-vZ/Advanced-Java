package Lesson_4_P1;


import Lesson_4_P1.business.EmployeeStockPlan;
import Lesson_4_P1.domain.Admin;
import Lesson_4_P1.domain.Director;
import Lesson_4_P1.domain.Employee;
import Lesson_4_P1.domain.Engineer;
import Lesson_4_P1.domain.Manager;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);

        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        EmployeeStockPlan esp = new EmployeeStockPlan();

        printEmployee(eng, esp);

        printEmployee(adm, esp);
        printEmployee(mgr, esp);
        printEmployee(dir, esp);

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        printEmployee(mgr, esp);
    }

    public static void printEmployee(Employee emp){
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee (emp);
        System.out.println("Stock Options:   " + esp.grantStock(emp));
    }

}
