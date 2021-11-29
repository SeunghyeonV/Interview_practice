//Example code from 자바의 정석, page 204, ArrayEx11.java

public class randomNumCounter {
  public static void main(String[] args) {
    int numArr [ ] = new int [ 10 ];
    int counter [ ] = new int [ 10 ];
    
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = (int) (Math.random() * 10); // Generate numbers between 0 and 9
      System.out.print(numArr[i] + " ");
    }
    System.out.println();
    
    for(int i = 0; i < numArr.length; i++) {
      counter [numArr[i]]++;
    }
    for(int i = 0; i < numArr.length; i++) {
      System.out.println("The number of " + i + " is: " + counter[i]);
    }
  }
}
