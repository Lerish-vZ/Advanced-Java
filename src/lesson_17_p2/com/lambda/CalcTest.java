package lesson_17_p2.com.lambda;

import lesson_17_p2.com.lambda.SalesTxn;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        double t1 = tList.parallelStream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .mapToDouble(t -> t.getTransactionTotal())
                .sum(); // Radio Hut code here
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
        double t2 = tList.stream().parallel()
                .filter(t -> t.getBuyerName().equals("PriceCo"))
                .mapToDouble(t -> t.getTransactionTotal())
                .sum(); //PriceCo Code Here
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        
        double t3 = tList.stream().sequential()
                .filter(t -> t.getBuyerName().equals("Best Deals"))
                .mapToDouble(t -> t.getTransactionTotal())
                .sum();; // Best Deals Code here
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);                 
        
    }
}
