/**
* CS 1101 Lab 2 - Variables & Operators
* @author  Luis D. Sánchez
* @version 1.0
* @since   2018-09-13  
*/

import java.util.*;
public class MyJavaLab02 {
 public static void main(String[] args) {
  //import scanners.
  Scanner sc = new Scanner(System.in);
  //import second scanner to avoid scanner glitch with int variables skipping input line.
  Scanner sc2 = new Scanner(System.in);
  //Set variables equal to student info.
  String last = "Sanchez";
  String first = "Luis";
  int id = 80580022;
  boolean bouncer = false;
  //prompt use to enter age
  System.out.println(last + ", " + first + ", " + id);
  System.out.println("What is your age?"); 
  int age = sc.nextInt();
  //prompt user to enter country 
  System.out.println("What country would you like to visit (USA or Mexico)?");
  String ans = sc2.nextLine();

  //determine wether a student is old enough to drink in the chosen country.
  if (ans.equals("USA") && age > 20) {
   bouncer = true;
  }
  if (ans.equals("Mexico") && age > 17) {
   bouncer = true;
  }
  //print out student info and drinking eligibility.
  System.out.println("You selected " + ans + ", and your age is " + age + ". Legally allowed to drink: " + bouncer);
 }
}