import java.util.Scanner;

public class XOR {
  static Scanner scan = new Scanner(System.in);
  static int arraySize = scan.nextInt();
  static int [] xArray = new int[arraySize];
  static int [] yArray = new int[arraySize];
  
  public static void arraySetting () 
  {
    for(int i = 0; i < arraySize; i++)
    {
      xArray[i] = scan.nextInt();
    }
    for(int i = 0; i < arraySize; i++)
    {
      yArray[i] = scan.nextInt();
    }
  }
  
  public static void xorMatch () 
  {
    for(int i = 0; i < arraySize; i++)
    {
      if(xArray[i] == 0 && yArray[i]==0)
      {
        System.out.print(0 + " ");
      }
      else if(xArray[i] == 0 && yArray[i]== 1)
      {
        System.out.print(1 + " ");
      }
      else if(xArray[i] == 1 && yArray[i]== 0)
      {
        System.out.print(1 + " ");
      }
      else if(xArray[i] == 1 && yArray[i]== 1)
      {
        System.out.print(0);
      }
    }
  }
  
  public static void main(String [] args) {   
    arraySetting();
    xorMatch(); 
  }
}
