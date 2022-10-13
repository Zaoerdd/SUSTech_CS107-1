package Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class HundredIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[101];
        Arrays.fill(a, 0);

        int x = input.nextInt();
        while (x != 0) {
            a[x]++;
            x = input.nextInt();
        }

        for (int i = 1; i <= 100; i++) {
            if (a[i] != 0) {
                if (a[i] == 1) System.out.printf("%d occurs %d time\n", i, a[i]);
                else {
                    System.out.printf("%d occurs %d times\n", i, a[i]);
                }
            }
        }
    }
}
