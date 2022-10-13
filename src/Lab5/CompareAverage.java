package Lab5;

import java.util.Scanner;

public class CompareAverage {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = input.nextInt();
        System.out.printf("Enter %d numbers: ", n);
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) numbers[i] = input.nextInt();

        long current1 = System.currentTimeMillis();

        //for (int k = 0; k < 10000000; k++) {
            int sum = 0;
            int x = 0;
            for (int i = 0; i < n; i++) {
                sum += numbers[i];
            }
            double average = (double) sum / n;
            double average2 = 2 * average;
            //System.out.printf("average= %f\n", average);

            for (int i = 0; i < n - 1; i++) {
                //if (numbers[i] + numbers[0] > average2) break;
                for (int j = i + 1; j < n; j++) {
                    if (numbers[i] + numbers[j] < average2) x++;
                    else break;
                }
            }

            System.out.printf("The number of pairs of integer is %d\n", n * (n - 1) / 2 - x);

        //}


        long current2 = System.currentTimeMillis();
        System.out.printf("your program using %.7f second\n", (current2 - current1) / 1000.0000d);

    }
}
