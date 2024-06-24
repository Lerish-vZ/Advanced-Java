package lesson_18_p1.com;

import java.util.Date;
import java.sql.*;

public class SimpleJDBCExample {

    public static void main(String[] args) {
        // Create the "url"
        // assume database server is running on the localhost
        String url = "jdbc:postgresql://localhost:5432/java_adv";
        String username = "postgres";
        String password = "123456";

        // Create a simple query
//        String query = "select * from EMPLOYEE";
        String query = "SELECT * FROM public.\"Employee\"";

        // A try-with-resources example
        // Connection and Statement implement java.lan.AutoCloseable
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                Date birth_date = rs.getDate("BIRTHDATE");
                float salary = rs.getFloat("SALARY");
                System.out.println("Employee ID:   " + empID + "\n"
                        + "Employee Name: " + first.trim() + " " + last.trim() + "\n"
                        + "Birth Date:    " + birth_date + "\n"
                        + "Salary:        " + salary + "\n");

            }

            query = "INSERT INTO public.\"Employee\" VALUES ('Murray', '1950-09-21', 150000)";
            if(stmt.executeUpdate(query) != 1){
                System.out.println("Insert failed");
            }

        } catch (SQLException e) {
            System.out.println("Exception creating connection: " + e);
            System.exit(0);
        }
        // No need to close the Connection and Statement objects, the compiler
        // will generate these for us and call the close() statement on this
        // objects in the order we obtained them in the try

    }
}