import java.util.*;
public class Excercise3 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
     Scanner sc2 = new Scanner(System.in);

  System.out.println("What is your age?");
  int age = sc.nextInt();

  System.out.println("What is your sex?");
  String sex = sc2.nextLine();

  System.out.println("What is your maritial status?");
  String married = sc2.nextLine();

  if (sex.equals("Female")) {
   System.out.println("You will work only in urban areas.");
  }
  if (sex.equals("Male")) {
   if (age > 19 && age < 41) {
    System.out.println("You can work anywhere.");
   } else if (age > 39 && age < 61) {
    System.out.println("You will work only in urban areas.");
   }
  } else
   System.out.println("Error.");
 }
}