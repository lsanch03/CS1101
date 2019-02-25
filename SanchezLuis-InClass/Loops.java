import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many times do you want to print the phrase?");
        int ans = sc.nextInt();
        
        while(ans != 0){
            System.out.println("Good lucck for your exams");
            ans--;
        }
        System.out.println("");
    }
}