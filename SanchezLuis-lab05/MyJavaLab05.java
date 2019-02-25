import java.util.*;
public class MyJavaLab05 {
 public static void main(String[] args) {
  //Adds a extra line before running the code.
  System.out.println(" ");

  //Declaration of variables.
  String first = "Luis";
  String last = "Sanchez";
  int id = 80580022;
  //Prints student info.
  System.out.println(last + ", " + first + ", " + id);
  //Starts the program.
  startProgram();
 }
 public static void startProgram() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Welcome to Working with Numbers!");
  System.out.println("Please enter two numbers:");

  //Prompts user for two numbers that will be sent to their corresponding methods.
  System.out.println("Number 1:");
  double n1 = sc.nextDouble();
  System.out.println("Number 2:");
  double n2 = sc.nextDouble();
  //Sends both variables to a designated method.
  menuOptions(n1, n2);
 }
 public static void menuOptions(double num1, double num2) {
  Scanner sc = new Scanner(System.in);

  //Prompts user to select what they wish to do with their numbers.
  System.out.println("Please select a menu option below:");
  System.out.println("1. Calculate " + num1 + " + " + num2);
  System.out.println("2. Calculate " + num1 + " - " + num2);
  System.out.println("3. Calculate " + num1 + " * " + num2);
  System.out.println("4. Calculate " + num1 + " / " + num2);
  System.out.println("5. Calculate " + num1 + " ^ " + num2);
  int ans = sc.nextInt();

  //If statements determine to which menthods the variables will go to.
  if (ans == 1) {
   System.out.println(addNumbers(num1, num2));
  } else if (ans == 2) {
   double a = subtractNumbers(num1, num2);
   //format the variable to print out one decimal as instructed in the lab.
   System.out.printf("%.1f\n", a);
  } else if (ans == 3) {
   System.out.println(multiplyNumbers(num1, num2));
  } else if (ans == 4) {
   System.out.println(divideNumbers(num1, num2));
  } else if (ans == 5) {
   System.out.println(powerNumbers(num1, num2));
  } else {
   //Ends the program if an invalid answer is chosen.
   System.out.println("Invalid menu option");
   System.exit(0);
  }
  //Asks user if they wish to continue with the program.
  System.out.println("Would you like to keep Working with Numbers? (y/n)");
  String key = sc.next();

  //If answer is yes, program starts again
  if (key.equals("y")) {
   startProgram();
  }
 }

 //Methods that calculate what the user wished to do.
 public static double addNumbers(double n1, double n2) {
  return (n1 + n2);
 }
 public static double subtractNumbers(double n1, double n2) {
  return (n1 - n2);
 }
 public static double multiplyNumbers(double n1, double n2) {
  return (n1 * n2);
 }
 public static double divideNumbers(double n1, double n2) {
  return (n1 / n2);
 }
 public static double powerNumbers(double n1, double n2) {
  return (Math.pow(n1, n2));
 }
}