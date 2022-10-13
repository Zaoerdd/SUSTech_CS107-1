package Lab5;

import java.util.Scanner;

public class BasicArrayOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of myList1:");
        int n = input.nextInt();
        double[] myList1 = new double[n];
        System.out.printf("Enter %d values:", n);
        for (int i = 0; i < n; i++) myList1[i] = input.nextDouble();

        double[] myList2 = new double[n];
        System.arraycopy(myList1, 0, myList2, 0, n);

        double temp = myList1[0];
        for (int i = 0; i < n - 1; i++) myList1[i] = myList1[i + 1];
        myList1[n - 1] = temp;

        System.out.print("myList1:");
        for (double i : myList1) System.out.printf("%.1f ", i);
        System.out.println();

        System.out.print("myList2:");
        for (double i : myList2) System.out.printf("%.1f ", i);
        System.out.println();
    }
}
