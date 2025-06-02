package Functions;
import java.util.*;

public class VoterCheck {

    public static void checkVoter(int age){
        if(age >= 18){
            System.out.println("You are elegible to vote for the upcoming elections.");
        }
        else{
            System.out.println("You are not elegible to vote for the upcoming elections.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<0){
            System.out.println("Please Enter a valid age.");
        }
        else{
            checkVoter(age);
        }

    }
    
}
