package lesson_10_p7.com.lambda;

import lesson_10_p7.com.lambda.SalesTxn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class JoinTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out a sorted list of unique buyer names
        System.out.println("=== Sorted Buyer's List ===");
        String result = tList.stream() //Replace with your stream
                .map(t -> t.getSummaryStr())
                        .distinct()
                                .sorted(Comparator.comparing())
        
        System.out.println("Buyer list: " + result);
            
        
        
        
    }
}
