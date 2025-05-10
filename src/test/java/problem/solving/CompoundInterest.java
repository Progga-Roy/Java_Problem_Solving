// Problem 14 : Given principal, rate, and time as inputs, calculate compound interest using the formula
// A = P(1 + r/100)^t and print the amount rounded to two decimal places.
package problem.solving;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Calculate Compound Interest.");
        System.out.println("Principle : ");
        double principal = userInput.nextDouble();
        System.out.println("Rate : ");
        double rate = userInput.nextDouble();
        System.out.println("Time : ");
        double time = userInput.nextDouble();
        double amount = principal * Math.pow((1 + rate/100),time);
        System.out.printf("Compound Interest : %.2f\n ",amount);
    }
}
