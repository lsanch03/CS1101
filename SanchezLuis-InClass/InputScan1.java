import java.util.Scanner;

public class InputScan1 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter your name: ");
  String name = sc.nextLine(); //String input

  System.out.print("Enter your age: ");
  int age = sc.nextInt(); //Integer input

  System.out.print("Enter your GPA: ");
  double gpa = sc.nextDouble(); //Double output

  System.out.println("Name: " + name);
  System.out.println("Age: " + age);
  System.out.println("GPA: " + gpa);

 }
}