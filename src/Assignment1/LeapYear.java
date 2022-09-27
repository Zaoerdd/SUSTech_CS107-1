package Assignment1;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYears(int x){
        boolean flag = false;
        if ( x % 100 == 0 ){
            if ( x % 400 == 0){
                flag = true;
            }
        }
        else {
            if (x % 4 == 0){
                flag = true;
            }
        }
        return flag;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int days = 0;
            if ( isLeapYears(x) ) {
                System.out.println("Yes");
                if (x < 2000) {
                    days = (2000 - x) * 365 - 60;
                    for (int j = x; j < 2020; j++) {
                        if (isLeapYears(j)){
                            days++;
                        }
                    }
                } else {
                    days = (x - 2000) * 365 + 60;
                    for (int j = 2000; j < x; j++) {
                        if (isLeapYears(j)){
                            days++;
                        }
                    }
                }
                System.out.println(days-4);
            }
            else{
                System.out.println("No");
            }
        }
    }
}

