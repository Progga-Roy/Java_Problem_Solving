// Problem 8: Take a double value representing a score and a total possible score. Calculate the percentage and print it rounded to one decimal place.
package problem.solving;

import java.util.Scanner;

public class PercentageCalculation {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter score : ");
        double score = userInput.nextDouble();
        System.out.println("Enter total : ");
        double total = userInput.nextDouble();
        double calculatePercentage = (score/total)*100;
        System.out.printf("Percentage :  %.0f %%\n ", calculatePercentage);

    }
}
