//problem 5: Take a string input that represents a number and convert it to an integer or double based on whether
// it contains a decimal point.Print the converted value.
package problem.solving;

import java.util.Scanner;

public class StringToNumberConversion {
    public static void stringConversion(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string number  : ");
        String number = userInput.nextLine();
        if(number.contains(".")){
         double result = Double.parseDouble(number);
            System.out.println(result);
        }
        else{
            int result = Integer.parseInt(number);
            System.out.println(result);

        }

    }

    public static void main(String[] args){
     stringConversion();
    }
}
