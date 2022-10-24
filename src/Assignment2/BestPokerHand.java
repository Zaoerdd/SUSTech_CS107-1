package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class BestPokerHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] ranks = new char[5];
        int[] ints = new int[5];

        for (int i = 0; i < 5; i++) {
            ranks[i] = input.next().toCharArray()[0];
            ints[i] = input.nextInt();
        }

        Arrays.sort(ints);

        if (Straight(ints) & Flush(ranks)) {
            System.out.println("Straight Flush");
        } else if (Flush(ranks)) {
            System.out.println("Flush");
        } else if (Straight(ints)) {
            System.out.println("Straight");
        } else if (ThreeOfAKind(ints)) {
            System.out.println("Three of a Kind");
        } else if (Pair(ints)) {
            System.out.println("Pair");
        } else {
            System.out.println("High Card");
        }
    }

    public static boolean Flush(char[] ranks) {
        char c = ranks[0];
        for (int i = 1; i < 5; i++) {
            if (ranks[i] != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean Straight(int[] ints) {
        for (int i = 0; i < 4; i++) {
            if (ints[i] + 1 != ints[i + 1])
                return false;
        }
        return true;
    }

    public static boolean ThreeOfAKind(int[] ints) {
        for (int i = 0; i < 3; i++) {
            if (ints[i] == ints[i + 1] & ints[i + 2] == ints[i + 1])
                return true;
        }
        return false;
    }

    public static boolean Pair(int[] ints) {
        for (int i = 0; i < 4; i++) {
            if (ints[i] == ints[i + 1])
                return true;
        }
        return false;
    }
}
