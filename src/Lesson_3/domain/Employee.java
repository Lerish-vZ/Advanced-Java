package Lesson_3.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String empName;
    private String SSN;
    private double empSalary;

    public Employee(int empId, String empName, String SSN, double empSalary) { //makes class as immutable as possible
        this.empId = empId;
        this.empName = empName;
        this.SSN = SSN;
        this.empSalary =empSalary;
    } //makes sure that Employee instance is fully populated with data before it is a valid employee object
    public int getEmpId() {
        return empId;
    }

    public String getSSN() {
        return SSN;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void raiseSalary(double increase) { //increases salary
        this.empSalary += increase;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void changeName(String newName) { //changes name
        if (newName != null){
            this.empName = newName;
        }
    }

    public void printEmployee() {
        System.out.println();
        System.out.println("Employee ID: \t" + getEmpId());
        System.out.println("Employee Name: \t" + getEmpName());
        System.out.println("Employee Soc Sec #: \t" + getSSN());
        System.out.println("Employee Salary: \t" + NumberFormat.getCurrencyInstance().format((double) getEmpSalary()));
    }

    //The ID, salary and ssn fields are now immutable (no changes are allowed).
}

//The benefits of using encapsulation are as follows:
    /* Protects an object from unwanted access bt clients
        Prevents assigning undesired values for its variables by the clients, which can make the state of an object unstable
        Allows changing the class implementation without modifying the client interface
     */
