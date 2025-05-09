//Problem 6: Write a program that takes a weight in pounds as a double and converts it to kilograms (1 pound = 0.453592 kg).
// Print the result with two decimal places.
package problem.solving;

import java.util.Scanner;

public class PoundsToKilogram {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of pound : ");
        double pounds = userInput.nextDouble();
        double kilograms = pounds * 0.453592;
        System.out.printf("Weight in kilograms: %.2f kg\n ", kilograms);

    }
}
