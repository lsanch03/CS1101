import java.util.*;
public class LoopExamples {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
     
  System.out.println("Please enter the range: ");
  int range = sc.nextInt();
  System.out.println("Please specify if you need the odd or even numbers");
  String ans = sc2.nextLine();
     
  ans = ans.toUpperCase();
  if (ans.equals("EVEN")) {
   for (int i = 0; i < range; i = i+2) {
    System.out.println(i);
   }
  } else {
   for (int i = 1; i < range; i = i+2) {
    System.out.println(i);
   }
  }
 }
}