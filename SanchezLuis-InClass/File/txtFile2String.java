import java.io.*;
import java.util.*;
public class txtFile2String{
    public static void main(String[] args)throws FileNotFoundException{
        
        String fileName = "myFile.txt";
        writeMyFile(fileName);
        readMyFile(fileName);
        
    }
    public static String readMyFile(String a) throws FileNotFoundException{
        File myFile = new File(a);
        Scanner inputFile = new Scanner(myFile);
        String temp = "";
        
         while(inputFile.hasNextLine()){
        temp = temp + " " + inputFile.nextLine();   
        }
        return temp;
    }
    public static void writeMyFile(String b) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(b);
        
        pw.println("Hello my name is Luis");
        pw.println("Hello my name is Emily");
        pw.println("Hello my name is Micahel");
        pw.println("Hello my name is Jacob");
        pw.println("Hello my name is Kevyn");
        pw.close();
        
    }
}