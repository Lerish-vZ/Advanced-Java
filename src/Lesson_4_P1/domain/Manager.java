package Lesson_4_P1.domain;

public class Manager extends Employee {
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public String toString() {
        return super.toString() + "\nDepartment: \t" + getDeptName(); //super calls the parent class (you can access all the methods and public variables in parent class by using super.
    }
}
