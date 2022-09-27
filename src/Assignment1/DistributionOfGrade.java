package Assignment1;

import java.util.Scanner;

public class DistributionOfGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a[] = {0,0,0,0};

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x>=90)
                a[0]++;
            else if (x>=80)
                a[1]++;
            else if (x >= 70)
                a[2]++;
            else if (x >= 60)
                a[3]++;
        }

        System.out.printf("A: %d\n", a[0]);
        System.out.printf("B: %d\n", a[1]);
        System.out.printf("C: %d\n", a[2]);
        System.out.printf("D: %d\n", a[3]);
    }
}

//tykdddd
