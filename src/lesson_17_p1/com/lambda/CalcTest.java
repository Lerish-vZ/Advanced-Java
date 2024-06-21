package lesson_17_p1.com.lambda;

import lesson_17_p1.com.lambda.SalesTxn;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author oracle
 */
public class CalcTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");

        // Put code here
        Stream<SalesTxn> s1 = tList.stream();

        Stream<SalesTxn> s2 = s1.filter(e -> e.getBuyerName().equals("Radio Hut"));

        DoubleStream s3 = s2.mapToDouble(e -> e.getTransactionTotal());
        double t1 = s3.sum(); // Put result here

        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);

    }
}
