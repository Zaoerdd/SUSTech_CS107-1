package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class BestPokerHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] pokers = new char[5][3];

        for (int i = 0; i < 5; i++) {
            pokers[i][0] = input.next().toCharArray()[0];
            pokers[i][2] = input.next().toCharArray()[0];
        }

        if (Straight(pokers) & Flush(pokers)) {
            System.out.println("Straight Flush");
        } else if (Flush(pokers)) {
            System.out.println("Flush");
        } else if (Straight(pokers)) {
            System.out.println("Straight");
        } else if (ThreeOfAKind(pokers)) {
            System.out.println("Three of a kind");
        } else if (Pair(pokers)) {
            System.out.println("Pair");
        } else {
            System.out.println("High Card");
        }

    }

    public static boolean Flush(char[][] pokers) {
        char c = pokers[0][0];
        for (int i = 1; i < 5; i++) {
            if (pokers[i][0] != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean Straight(char[][] pokers) {
        int[] ints = new int[5];
        for (int i = 0; i < 5; i++) {
            ints[i] = pokers[i][2] - 48;
        }
        Arrays.sort(ints);
        for (int i = 0; i < 4; i++) {
            if (ints[i] + 1 != ints[i + 1])
                return false;
        }
        return true;
    }

    public static boolean ThreeOfAKind(char[][] pokers) {
        int[] ints = new int[5];
        for (int i = 0; i < 5; i++) {
            ints[i] = pokers[i][2];
        }
        Arrays.sort(ints);

        for (int i = 0; i < 3; i++) {
            if (ints[i] == ints[i + 1] & ints[i + 2] == ints[i + 1])
                return true;
        }
        return false;


    }

    public static boolean Pair(char[][] pokers) {
        int[] ints = new int[5];
        for (int i = 0; i < 5; i++) {
            ints[i] = pokers[i][2];
        }
        Arrays.sort(ints);
        for (int i = 0; i < 4; i++) {
            if (ints[i] == ints[i + 1])
                return true;
        }
        return false;
    }
}
