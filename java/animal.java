import java.util.Scanner;

public class animal {
  static String name;
  static int age;
  static String food;
  static Scanner scan = new Scanner(System.in);
  
  animal(String name, int age, String food) {
    this.name = name;
    this.age = age;
    this.food = food;
  }
  
  public String getName() {
    System.out.println("Enter name: ");
    name = scan.nextLine();
    return name;
  }
  
  public String getFood() {
    System.out.println("Enter food: ");
    food = scan.nextLine();
    return food;
  }
  
  public int getAge() {
    System.out.println("Enter age: ");
    age = scan.nextInt();
    scan.nextLine();
    return age;
  }
  
  public String toString() {
    return("Name: " + this.getName() + ", " +  "food: " + this.getFood() +", "+ "age: " + this.getAge());
  }
  
  public static void main(String[] args) {
    animal dog = new animal(name, age, food);
    animal cat = new animal(name, age, food);
    System.out.println(dog.toString());
    System.out.println(cat.toString());
  }
}
