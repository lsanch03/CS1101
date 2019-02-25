import java.util.*;
public class conditions2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int score = nextInt();
        if(score >= 90){
            Ssytem.out.println("Grade is A");
        }
        if(score >= 80){
            Ssytem.out.println("Grade is B");
        }
        if(score >= 70){
            Ssytem.out.println("Grade is C");
        } else
            System.out.println("Grade is F");
    }
}