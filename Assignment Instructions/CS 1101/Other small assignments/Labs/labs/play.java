public class play {
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
        FMP p1 = new FMP(puzzle);
        p1.printPath();
    }
}
