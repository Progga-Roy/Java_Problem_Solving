package problem.solving;

import java.util.Scanner;

public class CheckIntegerOrDecimal {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number :");
        double number = userInput.nextDouble();
//        if(number%1 ==0){
//            System.out.println("Integer!");
//        }
//        else{
//            System.out.println("Decimal!");
//        }

        if(number == (int) number){
            System.out.println("Integer!");
        }
        else{
            System.out.println("Decimal!");
        }

    }
}
