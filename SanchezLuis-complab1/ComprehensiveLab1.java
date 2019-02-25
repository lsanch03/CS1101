import java.util.*;
import java.text.DecimalFormat;
public class ComprehensiveLab1 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  //Adds a extra line before running the code.
  System.out.println(" ");

  /*

UPDATE: Test Bonus.

  */

  //Declaration of variables.
  String first = "Luis", last = "Sanchez";
  char letterGrade = 'Z', letterG = 'F';
  int id = 80580022, key = 0, ans = 0, nGrades = 0, maxPoints = 0;
  Double labGrade = 0.0, labAvg = 0.0, holder = 0.0, score = 0.0, hGrade = 0.0, hwAvg = 0.0, popGrade = 0.0, popAvg = 0.0, partGrade = 0.0, partAvg = 0.0, classAvg = 0.0, numCourses = 0.0, credit = 0.0, creditScore = 0.0, totalScore = 0.0, totalCredit = 0.0, gScore = 0.0, gpa = 0.0;

  //Prints student info.
  System.out.println(last + ", " + first + ", " + id);

  //To keep user in the program until they wish to quit.
  while (key != 1) {
   //Adds a extra line for aesthetic purposes.
   System.out.println(" ");
   System.out.println("1. Calculate 1101 Grades");
   System.out.println("2. Calculate your GPA");
   System.out.println("3. Exit");
   System.out.println(" ");
   System.out.println("Welcome to uGrade! Enter the menu option you want (1, 2,or 3):");
   ans = sc.nextInt();
   if (ans == 1) {

    //Calculation for: Lab assignments
    System.out.println("Input the number of grades you have received for lab assignments: ");
    nGrades = sc.nextInt();
    System.out.println("Input the maximum grade of all the lab assignments: ");
    maxPoints = sc.nextInt();

    for (int i = 0; i < nGrades; i++) {
     System.out.println("Input Grade " + (i + 1) + ": ");
     holder = sc.nextDouble();
     labGrade = labGrade + holder;
    }
    score = labGrade / maxPoints;
    labAvg = score * 0.58;
    System.out.println(score);
    System.out.println(labAvg);

    //Calculation for: Homework
    System.out.println("Input the number of grades you have received for homework: ");
    nGrades = sc.nextInt();
    System.out.println("Input the maximum grade of all the lab homework: ");
    maxPoints = sc.nextInt();

    for (int j = 0; j < nGrades; j++) {
     System.out.println("Input Grade " + (j + 1) + ": ");
     holder = sc.nextDouble();
     hGrade = hGrade + holder;
    }
    score = hGrade / maxPoints;
    hwAvg = score * 0.12;
    System.out.println(score);
    System.out.println(hwAvg);

    //Calculation for: Pop Quizes & In-lab assignments 
    System.out.println("Input the number of grades you have received for pop quizzes and in-lab assignments: ");
    nGrades = sc.nextInt();
    System.out.println("Input the maximum grade of all the pop quizzes and in-lab assignments: ");
    maxPoints = sc.nextInt();

    for (int z = 0; z < nGrades; z++) {
     System.out.println("Input Grade " + (z + 1) + ": ");
     holder = sc.nextDouble();
     popGrade = popGrade + holder;
    }
    score = popGrade / maxPoints;
    popAvg = score * 0.25;
    System.out.println(score);
    System.out.println(popAvg);

    //Calculation for: Participation
    System.out.println("Input the number of grades you have received for lab participation: ");
    nGrades = sc.nextInt();
    System.out.println("Input the maximum grade of all the lab participation: ");
    maxPoints = sc.nextInt();

    for (int l = 0; l < nGrades; l++) {
     System.out.println("Input Grade " + (l + 1) + ": ");
     holder = sc.nextDouble();
     partGrade = partGrade + holder;
    }
    score = partGrade / maxPoints;
    partAvg = score * 0.05;
    System.out.println(score);
    System.out.println(partAvg);

    //Calculation of Letter Grades
    classAvg = (labAvg + hwAvg + popAvg + partAvg) * 100;
    if (classAvg >= 90) {
     letterGrade = 'A';
    } else if (classAvg >= 80) {
     letterGrade = 'B';
    } else if (classAvg >= 70) {
     letterGrade = 'C';
    } else if (classAvg >= 60) {
     letterGrade = 'D';
    } else {
     letterGrade = 'F';
    }

    System.out.println("Your current grade is " + String.format("%.2f", classAvg) + " which corresponds to a " + letterGrade + ".");

   } else if (ans == 2) {
    System.out.println("Please enter the number of classes that you took last semester.");
    numCourses = sc.nextDouble();

    for (int i = 0; i < numCourses; i++) {
     System.out.println("Please enter the number of credit hours for course #" + i);
     credit = sc.nextDouble();

     System.out.println("Please enter your letter grade for this course");
     letterG = sc.next().charAt(0);

     //Determines what grade letter the student recived to award earned points
     if (letterG == 'A') {
      gScore = credit * 4.1;
     } else if (letterG == 'B') {
      gScore = credit * 3.3;
     } else if (letterG == 'C') {
      gScore = credit * 2.4;
     } else if (letterG == 'D') {
      gScore = credit * 1.4;
     } else {
      gScore = 0.0;
     }
     totalScore = totalScore + gScore; //Keeps track of total scores 
     totalCredit = totalCredit + credit; //Keeps track of total credit

    }
    gpa = totalScore / totalCredit;
    System.out.println("Your GPA is: " + String.format("%.2f", gpa));
   } else {
    System.out.println("Good bye, thank you for using uGrade!");
    key = 1;
   }
  }
 }
}