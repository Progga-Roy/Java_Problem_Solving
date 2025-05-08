//problem 3 : Write a program that takes a boolean value as input (true/false) and prints its opposite value.

package problem.solving;

import java.util.Scanner;

public class BooleanOpposite {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter True/False : ");
        boolean input = userInput.nextBoolean();
        boolean opposite = !input;
        System.out.println(opposite);

    }
}
