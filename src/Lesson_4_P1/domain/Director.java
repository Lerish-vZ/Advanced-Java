package Lesson_4_P1.domain;

public class Director extends Manager {

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String department, double budget) {
        super(empId, name, ssn, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public String toString() {
       return super.toString() +"\nBudget: \t" + getBudget();
    }
}