package Lab6;

import java.util.Scanner;

public class Lab6E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input three numbers for bottom and height:");
        double bottom = input.nextDouble();
        double height = input.nextDouble();
        System.out.printf("The area is %.3f\n", MyTriangle.area(bottom, height));

        System.out.println("Please input two numbers for a and b:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Please input a number in (0, 180) for angle (angle is a float variable):");
        int angleOfAandB = input.nextInt();
        System.out.printf("The area is %.3f\n", MyTriangle.area(a, b, angleOfAandB));
    }
}
