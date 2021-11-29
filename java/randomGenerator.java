/* KSU tutoring lab */
//Generate numbers: -100 to 100. allocate the numbers in the Array[20];

import java.util.Random;

public class random{
  public static void main(String[] args){
    
    Random rand = new Random();
    
    int Array[] = new int[20];
    for(int i = 0; i < Array.length; i++)
    {
       Array[i] = rand.nextInt(200) - 100;
    }
    
    for(int j = 0; j < Array.length; j++)
    {
    System.out.print(Array[j] + " ");
    }
   
  }
}
