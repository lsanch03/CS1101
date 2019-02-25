import java.io.*;
import java.util.*;
public class FileReader{
    public static void main (String[] args)throws FileNotFoundException{
        File myFile = new File("myFile.txt");
        Scanner inputFile = new Scanner(myFile);
        PrintWriter pw = new PrintWriter("myFile.txt"); //To write.
        
        pw.println("Hello my name is Luis");
        pw.println("Hello my name is Emily");
        pw.println("Hello my name is Micahel");
        pw.println("Hello my name is Jacob");
        pw.println("Hello my name is Kevyn");
        pw.close();
        
        while(inputFile.hasNextLine()){
         System.out.println(inputFile.nextLine());   
         System.out.println(" ");   
        }
    }
}