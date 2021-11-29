import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class reverseArray {
  public static void rArray() {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Input the length of an array: ");
    int arrayLength = scan.nextInt();
    Integer rArray[] = new Integer[arrayLength];
    
    System.out.println("Input the numbers in an array: ");
    for(int i = 0; i < arrayLength; i++)
    {
      rArray[i] = scan.nextInt();
    }
    
    Arrays.sort(rArray);
    System.out.println("Inverse order: " + Arrays.toString(rArray));
    Arrays.sort(rArray, Collections.reverseOrder());
    System.out.println("Reverse order: " + Arrays.toString(rArray));
  }
  
  public static void main(String[] args) {
    rArray();   
  }
}
