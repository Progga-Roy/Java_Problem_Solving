// Problem 12 : Given a year as input, use logical operators to determine if it is a leap year (divisible by 4, but not 100 unless divisible by 400).
// Print "Leap" or "Not Leap".
package problem.solving;

import java.util.Scanner;

public class CheckLeapYearOrNot {
    public void leapYearCheck(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = userInput.nextInt();
        if(year % 4 ==0 && year % 100 !=0){
            System.out.println(year + " is a Leap Year!");
        }
        else if(year % 400 ==0){
                System.out.println(year + " is a Leap Year!");
            }
        else {
            System.out.println(year + " is not a Leap Year!");
        }
    }
    public static void main(String[] args){
        CheckLeapYearOrNot y = new CheckLeapYearOrNot();
        y.leapYearCheck();
    }

}
