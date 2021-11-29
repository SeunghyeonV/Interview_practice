/*You are given two segments [l1;r1] and [l2;r2] on the x-axis. It is guaranteed that l1<r1 and l2<r2. 
Segments may intersect, overlap or even coincide with each other.
The example of two segments on the x-axis.
Your problem is to find two integers a and b such that l1≤a≤r1, l2≤b≤r2 and a≠b. 
In other words, you have to choose two distinct integer points in such a way that the first point belongs to the segment [l1;r1] 
and the second one belongs to the segment [l2;r2].
It is guaranteed that the answer exists. If there are multiple answers, you can print any of them.
You have to answer q independent queries.

Input
The first line of the input contains one integer q (1≤q≤500) — the number of queries.
Each of the next q lines contains four integers l1i,r1i,l2i and r2i (1≤l1i,r1i,l2i,r2i≤109,l1i<r1i,l2i<r2i) 
— the ends of the segments in the i-th query.

Output
Print 2q integers. For the i-th query print two integers ai and bi — such numbers that l1i≤ai≤r1i, l2i≤bi≤r2i and ai≠bi.
Queries are numbered in order of the input.
It is guaranteed that the answer exists. If there are multiple answers, you can print any.

*/


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class twoPointDistincts {
  private static int l1, r1,l2,r2 = 0;
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int numofQueries = scan.nextInt();
    
    for(int i = 0; i < numofQueries; i++)
    {
      l1 = scan.nextInt();
      r1 = scan.nextInt();
      l2 = scan.nextInt();
      r2 = scan.nextInt();
      int a1 = ThreadLocalRandom.current().nextInt(l1, r1 + 1);
      int b1 = ThreadLocalRandom.current().nextInt(l2, r2 + 1);

      if(l1 != l2)
      {
        System.out.println(l1 + " " + l2);
      }
      
      else if(l1 != r2)
      {
        System.out.println(l1 + " " + r2);
      }
      
      else if(r1 != l2)
      {
        System.out.println(r1 + " " + l2);
      }
      
      else if(r1 != r2)
      {
        System.out.println(r1 + " " + r2);
      }
      
    }
  }
}


