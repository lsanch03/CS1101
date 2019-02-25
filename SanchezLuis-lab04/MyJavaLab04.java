import java.util.*;
public class MyJavaLab04 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
  //Adds a extra line before running the code.
  System.out.println(" ");

  //Declaration of variables.
  String first = "Luis";
  String last = "Sanchez";
  int id = 80580022, numReviewers = 0, numMovies = 0;
  String choice = "";
  int key = 0;

  //Prints student info.
  System.out.println(last + ", " + first + ", " + id);

  //Asks how many people will be reviewing movies, then we will use this number to know the length of the Reviewers array.
  System.out.println("How many movie reviewers are going to enter reviews?");
  numReviewers = sc.nextInt();

  String[] Reviewers = new String[numReviewers];
  // Ask the names of the reviewers.
  for (int i = 0; i < numReviewers; i++) {
   System.out.println("Enter movie reviewer #" + (1 + i));
   Reviewers[i] = sc2.nextLine();
  }
  //Here we ask the number of movies, then we will use this number to know the length of the Movie array.
  System.out.println("How many movies will be reviewed?");
  numMovies = sc.nextInt();
  //Here we create the 1D array that will contain the names of the movies.
  String[] Movies = new String[numMovies];

  //Here we prompt user to enter the Movie names.
  for (int j = 0; j < numMovies; j++) {
   System.out.println("Enter movie #" + (1 + j));
   Movies[j] = sc2.nextLine();

  }

  //Create the 2D-array where we will be sotring the feedback of each Reviewee
  String[][] Reviews = new String[numReviewers][numMovies];

  //Here we create a double for loop in which we take the reviews of everyone, movie by movie, and store them in a 2D-array.
  for (int k = 0; k < numReviewers; k++) {
   for (int l = 0; l < numMovies; l++) {
    System.out.println(Reviewers[k] + ": Enter review for " + Movies[l]);
    Reviews[k][l] = sc2.nextLine();
   }
  }

  //Adds a extra line for aesthetic purposes.
  System.out.println(" ");

  //This is where we print out the Reviews of each reviewer along with their comments.
  for (int m = 0; m < numReviewers; m++) {
   for (int n = 0; n < numMovies; n++) {
    System.out.println(Reviewers[m] + " reviewed " + Movies[n]);
    System.out.println("     " + Reviews[m][n]);
   }
  }
  //Adds a extra line for aesthetic purposes.
  System.out.println(" ");
 }
}