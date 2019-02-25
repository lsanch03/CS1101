import java.util.Scanner;

public class Excercise2 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name = sc.nextLine(); //String input

  System.out.print("Enter your age: ");
  int age = sc2.nextInt(); //String input & created new Scanner because Scanner skips a line

  System.out.print("Enter your favorite movie: ");
  String favMovie = sc.nextLine(); //Integer input

  System.out.print("Enter your zipcode: ");
  int zip = sc.nextInt(); //Integer input

  String recMovie = "Interstellar";

  System.out.println(" ");

  System.out.println("Hello " + name);
  System.out.println("If you like " + favMovie + ", I think you should watch " + recMovie + " and it is being played in your area " + zip + ".");
  System.out.println("Use promo code: B2m98x");

 }
}