package LectureTest;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;

        int[] c = new int[12];

        System.out.println(Arrays.toString(c));

        for (int j : c) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println(c[0]);
    }
}
