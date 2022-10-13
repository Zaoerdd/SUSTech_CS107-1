package Lab5;

import java.util.Scanner;

public class TheSameArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array:");
        int length = input.nextInt();
        boolean flag = true;
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        System.out.printf("Enter the 1st integer array of size %d:", length);
        for (int i = 0; i < length; i++) array1[i] = input.nextInt();
        System.out.printf("Enter the 2nd integer array of size %d：", length);
        for (int i = 0; i < length; i++) {
            array2[i] = input.nextInt();
            if (array2[i] != array1[i]) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("The two arrays are equal.");
        else System.out.println("The two arrays are not equal");


    }
}
