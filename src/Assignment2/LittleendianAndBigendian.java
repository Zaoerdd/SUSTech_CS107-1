package Assignment2;

import java.util.Scanner;

public class LittleendianAndBigendian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String str = input.next();
            System.out.print(str.charAt(6));
            System.out.print(str.charAt(7));
            System.out.print(str.charAt(4));
            System.out.print(str.charAt(5));
            System.out.print(str.charAt(2));
            System.out.print(str.charAt(3));
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(1));
            System.out.print(" ");
        }
    }
}
