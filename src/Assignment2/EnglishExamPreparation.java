package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class EnglishExamPreparation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double[] scores = new double[4];
        int[] day = new int[4];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) scores[j] = input.nextInt();
            for (int j = 0; j < 4; j++) day[j] = input.nextInt();

            int x = 0;
            while (Arrays.stream(scores).sum() < 100) {
                x++;
                for (int j = 0; j < 4; j++) {
                    if (scores[j] + 1.0 / day[j] <= 30) {
                        scores[j] += 1.0 / day[j];
                    }
                    else{
                        scores[j] = 30;
                    }
                }
            }
            System.out.println(x);
        }
    }
}
