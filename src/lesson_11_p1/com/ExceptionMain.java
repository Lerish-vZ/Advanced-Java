package lesson_11_p1.com;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            System.out.println("Reading from file: " + args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No file specified, quitting!");
            
        }
    }
}
