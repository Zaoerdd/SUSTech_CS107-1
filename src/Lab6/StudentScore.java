package Lab6;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of subjects: ");
        int subjects = input.nextInt();
        System.out.print("Please enter the number of students: ");
        int students = input.nextInt();

        int[][] scores = new int[subjects][students];

        for (int subject = 0; subject < subjects; subject++) {
            for (int student = 0; student < students; student++) {
                scores[subject][student] = input.nextInt();
            }
        }

        System.out.println("            Course1     Course2     Course3     Average");
        for (int student = 0; student < students; student++) {
            System.out.printf("Student%d    ", student + 1);
            int sum = 0;
            for (int subject = 0; subject < subjects; subject++) {
                System.out.printf("    %d     ", scores[subject][student]);
                sum += scores[subject][student];
            }
            System.out.printf("   %.2f   \n", (double) sum / subjects);
        }
        System.out.printf("Average      ");
        for (int subject = 0; subject < subjects; subject++) {
            int sum = 0;
            for (int score : scores[subject]) sum += score;
            System.out.printf("  %.2f    ", (double) sum / students);
        }

    }
}
