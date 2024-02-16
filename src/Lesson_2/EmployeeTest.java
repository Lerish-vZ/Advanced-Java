package Lesson_2;

import Lesson_2.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args){
       Employee emp1 = new Employee();
       emp1.setEmpId(101);
       emp1.setEmpName("Jane Smith");
       emp1.setSSN("012-34-5678");
       emp1.setEmpSalary(120_345.27);

       System.out.println("EMPLOYEE INFO \n" +
                       "ID: " + emp1.getEmpId() + "\n" +
                       "Name: " + emp1.getEmpName() + "\n" +
                       "Social Security Number: " + emp1.getSSN() + "\n" +
                       "Salary: " + emp1.getEmpSalary());
    }
}
