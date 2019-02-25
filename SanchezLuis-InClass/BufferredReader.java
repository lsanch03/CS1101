import java.util.*;
import java.io.*;

public class test{
    public static void main (String[] args){
        readMyFile();
        }
    public static void readMyFile(){
        try{
            File f = new File("/Users/luissanchez/Desktop/test.java");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str = "";
            
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
    }
    }
}