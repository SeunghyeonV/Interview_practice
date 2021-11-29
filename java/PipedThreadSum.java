import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Random;

public class PipedThreadSum {
  int sum = 0;
  InputStream input; 
  
  public static void main(String[] args) throws Exception {  
    PipedInputStream pis = new PipedInputStream();
    PipedOutputStream pos = new PipedOutputStream(pis);
    
    Thread1 t1 = new Thread1(pos); 
    t1.start();
    Thread2 t2 = new Thread2(pis); 
    t2.start();  
  }
}

//Thread 1 class
class Thread1 extends Thread {
  int sum = 0;
  OutputStream output;
  int array [] = new int [50000]; // array size 50000
  Random rand = new Random();
  
  //Thread 1 Constructor
  Thread1(OutputStream output) {
    this.output = output;
  }
  
  public void run() {
    for(int i = 1; i< 50000; i++) {
      //allocates random number between 1 to 9 to array
      array[i] = rand.nextInt(10);
      //sum of all array elements
      sum += array[i];
    } 
    
    try {
      output.write((sum + "\n").getBytes());
      System.out.println("[Thread1] Sum of 50000 numbers : " + sum);
      //Thread.currentThread().stop();   
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}

//Thread 2 class
class Thread2 extends Thread {
  int sum1 = 0, sum2 = 0;
  InputStream input;
  //arrays with 50000 elements
  int array [] = new int [50000];
  Random rand = new Random();
  
  //Thread2 constructor
  Thread2(InputStream input) {
    this.input = input;
  }
  
  public void run() {
    for(int i = 1; i < 50000; i++) {
      //allocates random number between 1 to 9 to array
      array[i] = rand.nextInt(10);
      //sum of all array elements
      sum2 += array[i];
    }
    
    try {
      int i=0;
      String line="";
      BufferedReader br = new BufferedReader(new InputStreamReader(input));
      if ((line=br.readLine()) != null) {
        sum1 = Integer.parseInt(line);
        System.out.println("[Thread2] Data from Thread 1: " + sum1);
      }
      else {
        return;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("[Thread2] Sum of 50000 array elements: " + sum2);
    System.out.println("[Thread2] Sum of 100000 array elements: " + (sum1 + sum2));  
  }
}

