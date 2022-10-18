package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class LargeNumberAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int length1 = input.nextInt();
            int length2 = input.nextInt();

            int length = Math.max(length1, length2) + 1;

            int[] number1 = new int[length];
            int[] number2 = new int[length];

            Arrays.fill(number1, 0);
            Arrays.fill(number2, 0);

            for (int j = length - length1; j < length; j++) {
                number1[j] = input.nextInt();
            }
            for (int j = length - length2; j < length; j++) {
                number2[j] = input.nextInt();
            }

            for (int j = length - 1; j > 0; j--) {
                number1[j] += number2[j];
                if (number1[j] >= 10) {
                    number1[j] -= 10;
                    number1[j - 1]++;
                }
            }

            if (number1[0]>0){
                System.out.printf("%d", number1[0]);
            }
            for (int j = 1; j < length; j++) {
                System.out.printf("%d", number1[j]);
            }
            System.out.println();
        }
    }
}
