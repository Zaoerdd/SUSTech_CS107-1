package Lab6;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of matrices: ");
        int n = input.nextInt();
        int[] rows = new int[n];
        int[] columns = new int[n];
        int[][][] matrixs = new int[n][][];

        for (int k = 0; k < n; k++) {
            System.out.printf("Enter the number of row and column of matrix %d: ", k + 1);
            rows[k] = input.nextInt();
            columns[k] = input.nextInt();

            matrixs[k] = new int[rows[k]][columns[k]];
            System.out.println("Enter the elements of the matrix: ");

            for (int i = 0; i < rows[i]; i++) {
                for (int j = 0; j < columns[i]; j++) {
                    matrixs[k][i][j] = input.nextInt();
                }
            }
        }
        




    }
}
