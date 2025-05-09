//Problem 11 :Take two integers and a character (+, -, *, /) as input. Perform the specified arithmetic operation and print the result.
package problem.solving;

import java.util.Scanner;

public class ArithmeticOperation {
    public void arithmeticOperatorFunction(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        int num_1 = userInput.nextInt();
        System.out.println("Enter second integer : ");
        int num_2 = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Enter a operator : ");
        char c = userInput.nextLine().charAt(0);
        if(c == '+'){
            int sum = num_1 + num_2;
            System.out.println("Sum : " + sum);
        } else if (c == '-') {
            int sub = num_1 - num_2;
            System.out.println("Sub : " + sub);
        }
        else if (c == '*') {
            int mul = num_1 * num_2;
            System.out.println("Mul : " + mul);
        }
        else if (c == '/') {
            if(num_2!= 0){
                int div = num_1 / num_2;
                System.out.println("Div : " + div);
            }
            else {
                System.out.println("Can not divide by Zero!");
            }
        }
        else{
            System.out.println("Invalid Operator!");
        }
    }
    public static void main(String[] args){
       ArithmeticOperation ap = new ArithmeticOperation();
       ap.arithmeticOperatorFunction();
    }
}
