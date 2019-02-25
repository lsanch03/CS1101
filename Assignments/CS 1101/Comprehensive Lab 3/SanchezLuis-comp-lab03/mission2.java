/*******************************************************************************
 * MISSION 2
 * NAME: Brandon A Bustamante
 *******************************************************************************/

public class mission2 {

    /* buildPath:
     *  •	takes a 2D array of positive integers; and
     *  •	returns a 2D array of strings in which you will write the correct
     *      path: the correct path is defined by the FMP rules (see mission 1
     *      document to remember the rules).
     *      divisible by 2 -->  LEFT
     *      divisible by 5 --> RIGHT
     *      divisible by 3 --> UP
     *      divisible by 7 --> DOWN
     ***************************************************************************/
    public static String[][] buildPath(int[][] maze) {
        // Here, we are creating the table that needs to be returned.
        // We are making sure that it has the same size as the maze
        String[][] result = new String[maze.length][maze[0].length];
        // Now, we are filling our path table with " ".
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[0].length; j++) {
                result[i][j]=" ";
            }
        }
        // Now, you need to complete the code of this method, so that
        // you write "X"s in cells that correspond to the cells you visit
        // in the given maze
        // You need to follow the rules of the FMP:
        int i = 0;
        int j = 0;
        while (!result[maze.length-1][maze.length-1].equals("x")) {
          result[i][j] = "x";
          if (maze[i][j] % 2 == 0 && !result[i][j-1].equals("x"))
            j--;
          else if (maze[i][j] % 5 == 0 && !result[i][j+1].equals("x"))
            j++;
          else if (maze[i][j] % 3 == 0 && !result[i-1][j].equals("x"))
            i--;
          else
            i++;
        }

        // And finally, you need to return the result table of strings
        return result;
    }

    /* printPath:
     *  •	takes a 2D array of strings that represents the path you need to take; and
     *  •	does not return anything: it only prints out this table.
     ***************************************************************************/
    public static void printPath(String[][] path) {
      for(int i = 0; i < path.length; i++) {
        for (int j = 0; j < path[i].length; j++) {
          System.out.print("|⎻" + path[i][j]);
        }
        System.out.println("|");
      }
    }


    /* Main method:
     * GIVEN TO YOU: DO NOT MODIFY
     ***************************************************************************/
    public static void main(String[] args) {
        int[][] puzzle = {{225,200,70,14,35,14,35,14,25,14},
                       {35,40,6,15,28,15,18,15,20,42},
                       {75,20,14,35,40,50,10,14,5,42},
                       {35,14,21,21,35,200,2,105,14,21},
                       {21,15,12,225,49,35,14,9,21,9},
                       {115,50,20,40,77,9,15,14,225,14},
                       {28,35,200,14,35,20,50,14,35,6},
                       {21,3,35,42,49,20,20,14,105,14},
                       {15,50,28,21,5,70,14,21,9,21},
                       {5,40,205,300,40,25,15,45,20,42}};
        String[][] path = buildPath(puzzle);
        printPath(path);
    }
}
