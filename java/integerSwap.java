//This code swaps the value of a and b
import java.util.Scanner;

public class integerSwap {
  static Scanner scan = new Scanner(System.in);
  
  public static void swap() {
    int a, b = 0;
    int temp;
    System.out.println("Input first value: ");
    a = scan.nextInt();
    System.out.println("Input second value: ");
    b = scan.nextInt();
    
    temp = a;
    a = b;
    b = temp;
    
    System.out.println("a is: " + a + " b is: " + b);
  }
  
  public static void main(String[] args) {
    swap();
  }
}
