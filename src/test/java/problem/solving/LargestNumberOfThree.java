// Problem 13 : Take three integers as input and use relational operators to find and print the largest number.
package problem.solving;

import java.util.Scanner;

public class LargestNumberOfThree {
     public static void main(String[] args){
         Scanner userInput = new Scanner(System.in);
         System.out.println("Enter first number : ");
         int a = userInput.nextInt();
         userInput.nextLine();
         System.out.println("Enter second number : ");
         int b = userInput.nextInt();
         userInput.nextLine();
         System.out.println("Enter third number : ");
         int c = userInput.nextInt();
         if(a>=b  && a>=c){
             System.out.println(" a is the largest number between " );
         } else if (b>=a  && b>=c) {
             System.out.println( " b  is the largest number between ");
         }
         else {
             System.out.println( " c is the largest number between " );
         }
     }
}
