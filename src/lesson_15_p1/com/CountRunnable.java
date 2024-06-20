package lesson_15_p1.com;

public class CountRunnable implements Runnable{
  
   final int count;
   final String threadName;
  
  // Setup Constructor to initialize variables
  public CountRunnable(int count, String name){
    this.count = count;
    this.threadName = name;
  }
  
  public void run(){ 
    // Count with for loop
  }
}
