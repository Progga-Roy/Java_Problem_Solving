//Problem 7 :Take a float value as input and convert it to a double. Print both values to demonstrate precision retention.

package problem.solving;

import java.util.Scanner;

public class FloatToDoubleConversion {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a float value : ");
        float floatValue = userInput.nextFloat();
        double doubleValue = floatValue;
        System.out.printf("Input Float value : %.10f\n " , floatValue);
        System.out.printf(" After conversion Double value : %.15f\n " , doubleValue);

    }
}
