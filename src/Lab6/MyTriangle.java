package Lab6;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input three numbers for a,b,c:");
        double a = input.nextDouble();
        double b, c;

        while (a != -1) {
            b = input.nextDouble();
            c = input.nextDouble();
            if (isValid(a, b, c)) {
                System.out.printf("The area is %.3f\n", area(a, b, c));
                System.out.printf("The perimeter is %.3f\n", perimeter(a, b, c));
                a = input.nextDouble();
            } else {
                System.out.println("The input is invalid");
                System.out.println("Please input three numbers for a,b,c:");
                a = input.nextDouble();
            }
        }
        System.out.println("Bye~");


    }

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double area(double bottom, double height) {
        return 0.5 * bottom * height;
    }

    public static double area(double a, double b, int angleOfAandB) {
        return 0.5 * a * b * Math.sin(angleOfAandB / 180.0 * Math.PI);
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static boolean isValid(double a, double b, double c) {
        double max = Math.max(Math.max(a, b), c);
        if (perimeter(a, b, c) - max > max) {
            return true;
        } else {
            return false;
        }
    }
}
