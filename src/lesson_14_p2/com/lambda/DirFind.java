package lesson_14_p2.com.lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class DirFind {
    
    public static void main(String[] args) {

        try{ // Add try with resources
            
            System.out.println("\n=== Find all dirs ===");
            // Print out directory list here
                
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    } 
}
