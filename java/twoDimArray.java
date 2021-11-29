import java.util.Scanner;

public class twoDimArray {
  static Scanner scan = new Scanner(System.in);
  static String array[][] = new String[3][3];
  static int row;
  static int column;
  static int guessRow;
  static int guessColumn;
  
  public static void arraySetting() {
    System.out.println("Fill in the array: ");
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array[i].length; j++) {
        array[i][j] = scan.nextLine();
      }
    }
  }
  
  public static void arrayPrint() {
    System.out.println("Your input is: ");
    //for(int i = 0; i < array.length; i++) {
    for(int j = 0; j < array[i].length; j++) {
      System.out.print(array[i][j] + " ");
      System.out.println("");
    }
  //}
  
  
  
  public static void hideMoney() {
    System.out.println("How much money do you need to hide? ");
    String money = scan.nextLine();
    
    System.out.println("Where would you like to hide your money? input row and column: ");
    row = scan.nextInt();
    column = scan.nextInt();
    System.out.println("You hide your money in " + (row+1) + "th row " + (column+1) + "th column." );
    array[row][column] += money; 
  }
  
  public static void findMoney() {
    System.out.println("Let's find your money.. guess the row and column.");
    int guessRow = scan.nextInt();
    int guessColumn = scan.nextInt();
    if(row == guessRow && column == guessColumn) {
      System.out.println("You found your money at: " + row + "th row " + column + "th column.");
    }
    else{
      System.out.println("There is no money. Try again.");
    }
  }
  
  
  public static void main(String[] args) {
    arraySetting();
    arrayPrint();
    hideMoney();
    findMoney();
  }
}
