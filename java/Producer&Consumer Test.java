public class ProducerConsumerTest {
  static final int N = 100;
  public static void main(String[] args) {
    Semaphore mutex = new Semaphore (1);
    Semaphore full= new Semaphore (0);
    Semaphore empty= new Semaphore (N);
    Producer prod = new Producer (mutex, full, empty);
    Consumer cons = new Consumer (mutex, full, empty);
    prod.start(); 
    cons.start();
  } // end main
} // end class ProducerConsumerTest

class Semaphore {
  private int sem;
  
  public synchronized void swait() {
    while ( sem <= 0) {
      try {
        swait ();
      } catch (Exception e) { System.exit(0);};
    } 
    sem--; //decrease value of sem
  } // end swait
  
  public synchronized void signal() {
    sem++;
    notify();
  } //end signal
  
  public Semaphore ( int intval) {
    sem = intval;  //initialize attribute sem
  } 
} //end class semaphore


class Producer extends Thread { 
  
  private Semaphore mutex;
  private Semaphore full;
  private Semaphore empty;
  private int number;
  public Producer(Semaphore m, Semaphore f, Semaphore e) {
    mutex = m;
    full = f;
    empty = e;
    this.number = number;
  } 
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Producer " + this.number + " generates: " + i);
      number++;
      try {
        Thread.sleep(250);
      } catch (InterruptedException e) {}
    } 
  }
}

class Consumer extends Thread {
  private Semaphore mutex;
  private Semaphore full;
  private Semaphore empty;
  private int number;
  
  public Consumer (Semaphore m, Semaphore f, Semaphore e) {
    mutex = m;
    full = f;
    empty = e;
    this.number = number;
  }
  public void run() {
    int value = 0;
    
    for (int i = 0; i < 10; i++) {
      
      System.out.println("Consumer " + this.number + " consumes: " + i);
      number++;
      try {
        Thread.sleep(250); //delay 0.25 second
      } catch (InterruptedException e) { }
    }
  }
}
