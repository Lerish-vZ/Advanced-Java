package lesson_11_p1.com;

import java.io.BufferedReader;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            System.out.println("Reading from file: " + args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No file specified, quitting!");
            System.exit(1);
        }

        BufferedReader b = new BufferedReader(new FileReader(args[0]));
        String s = null;
        while((s = b.readLine()) != null){
            System.out.println(s);
        }
    }
}
