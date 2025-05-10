// Problem 15 :Take age and citizenship status (true/false) as inputs. Use logical operators to determine if the person is
// eligible to vote (age >= 18 and citizen). Print "Eligible" or "Not Eligible".

package problem.solving;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Check Voting Eligibility.");
        System.out.println("Enter age : ");
        int age = userInput.nextInt();
        System.out.println("Enter citizenship - (true/false) : ");
        boolean citizenship = userInput.nextBoolean();
        if(age>=18 && citizenship){
            System.out.println("Eligible!");
        }
        else{
            System.out.println("Not Eligible!");
        }
    }
}
