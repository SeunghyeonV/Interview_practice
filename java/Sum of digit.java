/* KSU tutoring lab */
// Calculate the sum of each digits without using any loops - From entry level assignment tutoring
import java.util.Scanner;

public class practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int inputNumber;
    System.out.println("Enter your number: ");
    inputNumber = sc.nextInt();
    if (inputNumber >= 9999 || inputNumber < 0)
    {
      System.out.println("Invalid input. 0 - 9999 only.");
    }
    int firstDigit = inputNumber % 10;
    int secondDigit = (inputNumber / 10) % 10;
    int thirdDigit = (inputNumber / 100) % 10;
    int fourthDigit = (inputNumber / 1000);

    int Sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
    System.out.println("Sum of each digits: " + Sum);
  }
}

/*4856 % 10 = 6
 * 4856 / 10 = 485
  485 / 10 = 48
  48 / 10 = 4
  4 / 10 = 4*/
