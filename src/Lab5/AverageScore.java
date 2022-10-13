package Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 10 scores of these students: ");
        double[] a = new double[10];
        for (int i = 0; i < 10; i++) a[i] = input.nextDouble();

        double max = a[0];
        double min = a[0];
        for (double j : a) {
            if (j > max) max = j;
            if (j < min) min = j;
        }

        double averageScore = (Arrays.stream(a).sum() - max - min) / 8.0;
        System.out.printf("Average Score is %.2f", averageScore);
    }
}
