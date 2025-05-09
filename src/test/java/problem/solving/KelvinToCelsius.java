// Problem 9: Take a temperature in Kelvin as a double and convert it to Celsius (C = K - 273.15).Print the result with
// two decimal places, ensuring it’s not below absolute zero.
package problem.solving;

import java.util.Scanner;

public class KelvinToCelsius {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter temperature in Kelvin : ");
        double kelvin = userInput.nextDouble();
        if(kelvin < 0){

            System.out.println("Temperature in kelvin is not below absolute zero!");
        }
        else {
            double celsius = kelvin - 273.15;
            System.out.printf("Temperature in celsius: %.2f°C\n", celsius);
        }


    }
}
