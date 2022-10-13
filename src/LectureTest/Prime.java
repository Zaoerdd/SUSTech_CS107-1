package LectureTest;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0, b = 0;
        a = input.nextInt();
        b = input.nextInt();

        for (int i = a; i <= b; i++) {
            int j = 2;
            for (; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j * j > i) {
                System.out.printf("%d ", i);
            }
        }
    }
}
