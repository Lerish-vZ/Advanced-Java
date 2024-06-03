package lesson_9_p1.com.lambda;

import lesson_9_p1.com.lambda.Employee;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class ConsumerTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Consumer<Employee> eCons =
            e -> System.out.println(
                    "Name: " + e.getSurName() + " Role: " + e.getRole() + " Salary: " + e.getSalary()
            ); // Write your consumer lambda here
    
    System.out.println("=== First Salary");
    // Call your consumer here


    
  }
}
