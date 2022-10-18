package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class EnglishExamPreparation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] matrix = new int[2][4];


        for (int k = 0; k < n; k++) {
            int x = 0;
            for (int i = 0; i < 4; i++)
                matrix[0][i] = input.nextInt();
            for (int i = 0; i < 4; i++)
                matrix[1][i] = input.nextInt();

            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (matrix[1][i] > matrix[1][j]) {
                        int temp = matrix[0][i];
                        matrix[0][i] = matrix[0][j];
                        matrix[0][j] = temp;

                        temp = matrix[1][i];
                        matrix[1][i] = matrix[1][j];
                        matrix[1][j] = temp;
                    }
                }
            }

            int sum = Arrays.stream(matrix[0]).sum();
            if (sum>=100){
                System.out.println(0);
                continue;
            }

            for (int i = 0; i < 4; i++) {
                if (sum + 30 - matrix[0][i] >= 100) {
                    x += (100 - sum) * matrix[1][i];
                    break;
                } else {
                    x += (30 - matrix[0][i]) * matrix[1][i];
                    sum += 30 - matrix[0][i];
                }
            }
            System.out.println(x);
        }
    }
}

