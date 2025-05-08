//Problem 2: Calculate the area of a circle given its radius as a double. Use the formula A = π * r² and
// output the result with two decimal places.
package problem.solving;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args){
        Scanner  userInput = new Scanner(System.in);
        System.out.println("pi : 3.1416");
        System.out.println("Enter the radius(r) : ");
        double r = userInput.nextDouble();
        double pi = 3.1416;
        double area = pi*r*r;
        System.out.printf("Area of a circle : %.2f\n " , area);
     }
}
