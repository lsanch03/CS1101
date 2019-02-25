import java.util.Scanner;
public class Calculator {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Please enter a number: ");
  int a = sc.nextInt();

  System.out.println("Please enter another number: ");
  int b = sc.nextInt();

  System.out.println("What would you like to do?  ");
  System.out.println("1. Add numbers");
  System.out.println("2. Multiply numbers");
  System.out.println("3. Divide numbers");
  System.out.println("4. Subtract numbers");
  System.out.println("5. Exit");

  int ans = sc.nextInt();


  if (ans = 1) {
   System.out.println("Sum of " + a + " + " + b + " is " + (a + b));
  } else if (ans = 2) {
   System.out.println("Product of " + a + " x " + b + " is " + (a * b));
  } else if (ans = 3) {
   System.out.println("Product of " + a + " x " + b + " is " + (a * b));
  } else if (ans = 4) {
   System.out.println("The division of " + a + " + " + b + " is " + (a / b));
  }
 }
}