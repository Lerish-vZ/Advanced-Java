package lesson_16_p1.com;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayAction extends RecursiveAction {
    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end;

    public RandomArrayAction(int[] myArray, int start, int end, int threshold) {
        this.myArray = myArray;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    protected void compute() {
        if (end - start <= threshold) {
            for (int i = start; i < end; i++) {
                myArray[i] = ThreadLocalRandom.current().nextInt(); //ThreadLocalRandom is used instead of Math.random() because Math.random() does not scale when executed concurrently by multiple threads and would eliminate the benefit of applying the Fork-Join framework.
            }
        }
    }
}
