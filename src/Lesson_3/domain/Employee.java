package Lesson_3.domain;

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

    public String getEmpName() {
        return empName;
    }

    public void changeName(String newName) { //changes name
        if (newName != null){
            this.empName = newName;
        }
    }

    //The ID, salary and ssn fields are now immutable (no changes are allowed).
}

//The benefits of using encapsulation are as follows:
    /* Protects an object from unwanted access bt clients
        Prevents assigning undesired values for its variables by the clients, which can make the state of an object unstable
        Allows changing the class implementation without modifying the client interface
     */
