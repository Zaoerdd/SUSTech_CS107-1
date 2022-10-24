package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbersInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean[] array = new boolean[n];
        Arrays.fill(array, false);

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            array[a - 1] = true;
        }

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (!array[i]) {
                if (!flag) {
                    System.out.printf("%d", i + 1);
                    flag = true;
                } else {
                    System.out.printf(" %d", i + 1);
                }
            }
        }
        if (!flag) {
            System.out.println("NULL");
        }

    }
}
