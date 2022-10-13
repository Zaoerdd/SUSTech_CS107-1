package Assignment1;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            float x1 = input.nextFloat();
            float y1 = input.nextFloat();
            float x2 = input.nextFloat();
            float y2 = input.nextFloat();
            float x = input.nextFloat();

            float y = (y2 - y1) / (x2 - x1) * (x - x1) + y1;

            System.out.printf("%.1f\n", y);
        }
    }
}
