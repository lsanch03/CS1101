import java.util.*;
public class MyJavaLab03 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  //Adds a extra line before running the code.
  System.out.println(" ");

  //Declaration of variables.
  String first = "Luis";
  String last = "Sanchez";
  int id = 80580022;
  String choice = "";
  int key = 0;

  //Prints student info.
  System.out.println(last + ", " + first + ", " + id);

  while (key != 1) {
   //Adds a extra line for aesthetic purposes.
   System.out.println(" ");
   //Prompts user to choose what they would like to do.
   System.out.println("Type 'quit' to exit program.");
   System.out.println("Which country would you like to learn more about:");
   System.out.println("Australia, France, Mexico, Nigeria, Philippines, USA");
   choice = sc.nextLine();
   //Adds a extra line for aesthetic purposes.
   System.out.println(" ");

   //Bonus
   choice = choice.toUpperCase();

   //Break case determines what to print out.ss
   switch (choice) {
    case "AUSTRALIA":
     System.out.println("There are three times as many sheep than people living in Australia.");
     break;
    case "FRANCE":
     System.out.println("France is the world's most popular tourist destination (approximately 83.7 million visitors arrived in France in 2014).");
     break;
    case "MEXICO":
     System.out.println("The first printing press in North America was used in Mexico City in 1539.");
     break;
    case "NIGERIA":
     System.out.println("Nigeria is the seventh most populated country in the world.");
     break;
    case "PHILIPPINESS":
     System.out.println("Philippines has approximately 7500 islands, with only about 2000 of them inhabited.");
     break;
    case "USA":
     System.out.println("Americans eat about 100 acres of pizza each day, with about 3 billion pizzas sold annually in the USA.");
     break;
    case "QUIT":
     key = 1; //ends loops
     break;
    default:
     System.out.println("Invalid choice. Please check your spelling.");
     break;
   }
  }
  System.out.println("Have a great day!");
  //Adds a extra line at the end of the terminal after running code for aesthetic purposes.
  System.out.println(" ");
 }
}