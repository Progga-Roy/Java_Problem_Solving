//Problem 4: Take a double value representing a temperature in Celsius.
// Check if it is within a valid range (-50 to 50).
// Print "Valid" or "Invalid".

package problem.solving;

import java.util.Scanner;

public class TemperatureRangeCheck {
    public void temperatureCheck(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius : ");
        double celsius = userInput.nextDouble();
        if(celsius >= -50 && celsius <= 50){
            System.out.println("Valid");

        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args){
         TemperatureRangeCheck t = new TemperatureRangeCheck();
         t.temperatureCheck();
    }
}
