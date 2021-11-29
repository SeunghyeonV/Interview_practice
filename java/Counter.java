import java.util.Random;

class headTail {
  public static void main(String[ ] args) {
    //Counter Head, Tail;
    Counter Head = new Counter();
    Counter Tail = new Counter();
    
    Random rand = new Random();
    int side[] = new int[100];
    
    for(int i = 0; i < side.length; i++) {
      side[i] = rand.nextInt(2);
      System.out.print(side[i]);    
      
//      if(side[i] == 1) {
//        Head.increment();
//      }
//      else{
//      Tail.increment();
//      } 
      
      switch(side[i]){
        case 0 : Head.increment();
        break;
        case 1 : Tail.increment();
        break;
        default: break;
      }
    }
    
    System.out.println("\n"+"Total heads: " + Head.getValue());
    System.out.println("Total tails: " + Tail.getValue());
  }
}

class Counter {
  private int count = 0;
  
  public void increment() {
    count++;
  }
  
  public int getValue() {
    return count;
  }
}

