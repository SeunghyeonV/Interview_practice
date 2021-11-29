import java.util.Scanner;

public class reverseInteger {
  static Scanner scan = new Scanner(System.in);
  static int Input, reverse = 0;
  
  public static void reversing() {
    Input = scan.nextInt();
    while(Input != 0)
    {
      reverse = reverse * 10 + Input % 10;
      Input = Input / 10;
    }
  }
  
  public static void ifNegative() {
   if(Input < 0)
    {
      System.out.println(reverse * -1);
    }
    else {
      System.out.println(reverse);
    }
  }
  
  public static void main(String [] args) {
    reversing();
    ifNegative();
  }
}
