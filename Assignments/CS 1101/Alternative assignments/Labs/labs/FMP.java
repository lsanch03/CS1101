public class FMP {

    // ATTRIBUTES: ******************************************************************
    private int[][] puzzle;
    private String[][] path;
    private boolean solvable;

    // CONSTRUCTORS: ******************************************************************
    public FMP() {}

    public FMP(int[][] maze) {
        // Initialize puzzle
        puzzle = maze;
        // Initialize path to be a table of the same dimensions as puzzle
        path = new String[maze.length][maze[0].length];
        // Now, we are filling our path table with " ".
        for (int i=0; i<path.length; i++)
            for (int j=0; j<path[0].length; j++)
                path[i][j]=" ";
        // call the method buildPath on your current instance: given to you
        this.buildPath();
    }

    // SETTERS: ******************************************************************
    public void setPuzzle(int[][] maze) {
        // Same code as for the second constructor
        // Initialize puzzle
        puzzle = maze;
        // Initialize path to be a table of the same dimensions as puzzle
        path = new String[maze.length][maze[0].length];
        // Now, we are filling our path table with " ".
        for (int i=0; i<path.length; i++)
            for (int j=0; j<path[0].length; j++)
                path[i][j]=" ";
        // call the method buildPath on your current instance: given to you
        this.buildPath();
    }

    // GETTERS:  ******************************************************************
    // One getter method per attribute (lines 3, 4, and 5)
    public int[][] getPuzzle() {
      return puzzle;
    }

    public String[][] getPath() {
      return path;
    }

    public boolean getSolvable() {
      return solvable;
    }

    // OTHER METHODS:  ************************************************************

    /* buildPath:
     ***************************************************************************/
    public void buildPath() {
        // Now, you need to complete the code of this method, so that
        // you write "X"s in cells that correspond to the cells you visit
        // in the given maze
        // You need to follow the rules of the FMP:
        int i = 0;
        int j = 0;
        while (!path[puzzle.length-1][puzzle.length-1].equals("x")) {
          path[i][j] = "x";
          if (puzzle[i][j] % 2 == 0 && !path[i][j-1].equals("x") && j < puzzle.length)
            j--;
          else if (puzzle[i][j] % 5 == 0 && !path[i][j+1].equals("x") && j < puzzle.length)
            j++;
          else if (puzzle[i][j] % 3 == 0 && !path[i-1][j].equals("x") && i < puzzle.length)
            i--;
          else if (puzzle[i][j] % 7 == 0 && !path[i+1][j].equals("x") && i < puzzle.length)
            i++;
          else
            break;
        }
        // At the end of your code, if you have reached the bottom right corner
        // of the maze, the puzzle is solvable (true). Otherwise it is not (false).
        // Your code may look like the following two commented lines:
        // if ((i!=puzzle.length-1)||(j!=puzzle[0].length-1)) solvable = false;
        // else solvable = true;
        if ((i != puzzle.length-1) || (j != puzzle[0].length-1))
          solvable = false;
        else
          solvable = true;
    }

    // buildPathR
    public void buildPathR() {
      path[0][0] = "x";
      this.buildPathAux(0,0);
    }

    // buildPathAux
    public void buildPathAux(int i, int j) {
      path[i][j] = "x";
      // BASE CASES
      if  (path[puzzle.length-1][puzzle.length-1].equals("x")) {
        solvable = true;
        return;
      }
      if (i > puzzle.length || j > puzzle.length) {
        solvable = false;
        return;
      }
      // RECURSIVE CALLS
      if (puzzle[i][j] % 2 == 0 && !path[i][j-1].equals("x"))
        buildPathAux(i, j-1);
      else if (puzzle[i][j] % 5 == 0 && !path[i][j+1].equals("x"))
        buildPathAux(i, j+1);
      else if (puzzle[i][j] % 3 == 0 && !path[i-1][j].equals("x"))
        buildPathAux(i-1, j);
      else if (puzzle[i][j] % 7 == 0 && !path[i+1][j].equals("x"))
        buildPathAux(i+1, j);
    }

    /* printPath:
     ***************************************************************************/
    public void printPath() {
      for(int i = 0; i < path.length; i++) {
        for (int j = 0; j < path[i].length; j++) {
          System.out.print("|⎻" + path[i][j]);
        }
        System.out.println("|");
      }
    }

}
