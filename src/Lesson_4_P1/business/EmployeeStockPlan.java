package Lesson_4_P1.business;

import Lesson_4_P1.domain.Director;
import Lesson_4_P1.domain.Employee;
import Lesson_4_P1.domain.Manager;

public class EmployeeStockPlan {
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public int grantStock (Employee emp) {
        //Stock is granted based on the employee type
        if (emp instanceof Director) {
            return directorShares;
        } else {
            if (emp instanceof Manager){
                return managerShares;
            } else {
                return employeeShares;
            }
        }
    }
}
