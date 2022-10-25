package Lab7;

import java.util.ArrayList;
import java.util.Scanner;
import static Lab7.SoftOpening.*;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Food> foodList = generateMenu();
        User user = generateUser();
        user.introduce();
        userConsume(foodList, user);
        user.introduce();
        in.close();
    }
}
