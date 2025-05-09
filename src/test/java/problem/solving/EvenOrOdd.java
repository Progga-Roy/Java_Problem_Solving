
//Problem 10: Take an integer as input and use the modulo operator to determine if it is even or odd. Print "Even" or "Odd".
package problem.solving;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = userInput.nextInt();
        if(number % 2 ==0){
            System.out.println(number + " is an Even number");
        }
        else {
            System.out.println(number + " is a Odd number");
        }
    }
}
