package Lab4;

import java.util.Scanner;

public class CalculatePi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please input n:\n");
        int n = input.nextInt();
        double pi = 0;

        int x = 1;
        while (x < 2 * n) {
            if (x % 4 == 1)
                pi = pi + (double) 4 / x;
            else
                pi = pi - (double) 4 / x;
            x += 2;
        }
        System.out.printf("The estimation of Pi is %.6f\n", pi);


        double exactPi = Math.PI;
        System.out.println("Please input the precision:");
        int y = 1;
        pi = 0;
        double m = input.nextDouble();
        do {
            if (y % 4 == 1)
                pi = pi + 4.0 / y;
            else
                pi = pi - 4.0 / y;
            y += 2;
        } while (pi - exactPi > m || exactPi - pi > m);
        System.out.printf("The estimation of Pi is %f\n", pi);
        System.out.printf("It computed %d times", (y + 1) / 2);


    }
}
