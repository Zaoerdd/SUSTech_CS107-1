package Assignment1;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String list[] = {"yes","no","yes","no","yes","no","yes","yes","no","yes","no","yes"};

        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            System.out.println(list[x-1]);
        }
    }
}
