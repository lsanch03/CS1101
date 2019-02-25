//Luis D. Sánchez

public class MyJavaLab01{
    public static void main(String[] args){
        
        //Assigning value to our variables. Line 5-13
        String last = "Sanchez";
        String first = "Luis";
        int id = 80580022;
        double r1 = 91.53;
        double r2 = 88.65;
        double r3 = 39.15;
        double r4 = 53.88;
        double r5 = 65.33;
        double rTotal = ((r1 + r2 + r3 + r4 + r5)/5);
        
        //Printing information out. Lines 16-26
        System.out.println(" ");
        System.out.println(last + ", " + first + ", " + id);
        System.out.println(" ");
        System.out.println("Random double: " + r1);
        System.out.println("Random double: " + r2);
        System.out.println("Random double: " + r3);
        System.out.println("Random double: " + r4);
        System.out.println("Random double: " + r5);
        System.out.println(" ");
        System.out.println("Avergae: " + rTotal);
        System.out.println(" ");
    }
}