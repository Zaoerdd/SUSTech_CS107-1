package Lab4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d  ", j,i,j*i);
            }
            System.out.printf("\n");
        }

    }
}
