package Lab5;

import java.io.*;
import java.util.Scanner;

public class ErFen {
    public static void main(String[] args)throws IOException {
//        Scanner input = new Scanner(System.in)
        File inFile = new File("C:\\Users\\tyk1304245946\\Desktop\\input8.in");
        FileInputStream fos = new FileInputStream(inFile);
        StreamTokenizer re = new StreamTokenizer(new BufferedReader(new InputStreamReader(fos)));
        re.nextToken();
        System.out.print("Enter how many numbers:");
//        int n = input.nextInt();
        int n = (int) re.nval;
        System.out.printf("Enter %d numbers: ", n);
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
//            numbers[i] = input.nextInt();
            re.nextToken();
            numbers[i] = (int) re.nval;
        }


        long current1 = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / n;
        double doubleAverage = 2 * average;

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] + numbers[n - 1] <= doubleAverage) continue;
            if (numbers[i] + numbers[i + 1] > doubleAverage) {
                ans += n - i - 1;
                continue;
            }

            int left = i;
            int right = n - 1;
            int x = (left + right) / 2;
            while (!(numbers[i] + numbers[x - 1] <= doubleAverage && numbers[i] + numbers[x] > doubleAverage)) {
                if (numbers[i] + numbers[x] <= doubleAverage) {
                    left = x;
                    x = (left + right + 1) / 2;
                } else if (numbers[i] + numbers[x - 1] > doubleAverage) {
                    right = x;
                    x = (left + right) / 2;
                }
            }
            ans += n - x;
        }

        System.out.println(ans);


        long current2 = System.currentTimeMillis();
        System.out.printf("your program using %.7f second\n", (current2 - current1) / 1000.0000d);
    }
}
