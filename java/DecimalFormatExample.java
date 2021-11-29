import java.util.Scanner;
import java.text.DecimalFormat;

public class decimalGrade {
  static String decimal = "0.00";
  static double average=0;
  
  private static void applyCustomFormat (String pattern, double value) {
    DecimalFormat df = new DecimalFormat(pattern); 
    df.applyPattern(pattern);
    System.out.println(df.format(average));
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double G1 = scan.nextDouble();
    double G2 = scan.nextDouble();
    double G3 = scan.nextDouble();
    double G4 = scan.nextDouble();
    average = ((G1 + G2 + G3 + G4) / 4);
    applyCustomFormat(decimal, average);
  }
  
}
