package Lab4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter expressions such as 2.0 + 2. Type -1 to quit.");

        float x = input.nextFloat();
        char c;
        float y = 0;

        while (x != -1) {
            c = input.next().toCharArray()[0];
            y = input.nextFloat();
            switch (c){
                case '+':
                    System.out.printf("Result: %.1f\n", x+y);
                    break;
                case '-':
                    System.out.printf("Result: %.1f\n", x-y);
                    break;
                case '*':
                    System.out.printf("Result: %.1f\n", x*y);
                    break;
                case '/':
                    System.out.printf("Result: %.1f\n", x/y);
                    break;
                default:
                    System.out.printf("Unknown Operator: %c\n", c);

            }

            x = input.nextFloat();
        }
    }
}
