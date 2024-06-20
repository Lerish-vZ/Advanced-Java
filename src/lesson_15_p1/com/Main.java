package lesson_15_p1.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

  public static void main(String[] args) {
    // Setup Executor
    ExecutorService es = Executors.newCachedThreadPool();

    // Submit Runnable
    es.submit(new CountRunnable(20, "A"));
    es.submit(new CountRunnable(20, "B"));
    es.submit(new CountRunnable(20, "C"));

    // Shutdown ExectuorService
    es.shutdown();
  }
}
