package Lab5;

import java.io.*;

public class DoubleZhizheng {
    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in)
        File inFile = new File("Filename");                     //请注意自行修改.in文件名
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


        int left = 0;
        int right = n - 1;
        long ans = 0;

        while (left < right) {
            while (numbers[left] + numbers[right] > doubleAverage) {
                right--;
            }

            ans += n - right - 1;
            //System.out.println(ans);
            left++;
        }
        ans += (long) (n - 1 - right) * (n - 2 - right) / 2;

        System.out.println(ans);


/*
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
*/


        long current2 = System.currentTimeMillis();
        System.out.printf("your program using %.7f second\n", (current2 - current1) / 1000.0000d);
    }


}
