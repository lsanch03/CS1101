import java.util.Scanner;

public class Excercise1 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter your first name: ");
  String first = sc.nextLine(); //String input

  System.out.print("Enter your last name: ");
  String last = sc.nextLine(); //String input
     
  System.out.print("Enter your school's name: ");
  String school = sc.nextLine(); //String input
     
  System.out.print("Enter your student ID: ");
  int iD = sc.nextInt(); //Integer input

  System.out.print("Enter your Zipcode: ");
  int zip = sc.nextInt(); //Double output
     
System.out.println(" ");

  System.out.println("Hello, my name is " + last + ", " + first + ".");
  System.out.println("I am a student at " + school + " and my student id is " + iD);
  System.out.println("I live in the zip code " + zip);

 }
}