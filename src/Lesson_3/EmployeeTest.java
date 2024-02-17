package Lesson_3;

import Lesson_2.domain.Employee;
import Lesson_3.domain.Admin;
import Lesson_3.domain.Director;
import Lesson_3.domain.Engineer;
import Lesson_3.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args){
        Engineer eng1 = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager mng1 = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin ad1 = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director dir1 = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        eng1.printEmployee();
        mng1.printEmployee();
        ad1.printEmployee();
        dir1.printEmployee();

        mng1.setEmpName("Barabara Johnson-Smythe");
        mng1.raiseSalary(10_000.00);
        mng1.printEmployee();
    }
}
