package Lab5;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //1
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        array2[0] = 6;
        array2[1] = 7;
        array2[2] = 8;
        array2[3] = 9;
        array2[4] = 10;
        System.out.println(array2);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        for (int e : array2) {
            System.out.print(e + "\t");
        }
        System.out.println();

        //2
        int[] array3 = null;
        System.out.println(array3);
        array3 = array2;
        System.out.println(array3);


        //3
        for (int e : array3) {
            e = 1;
        }
        System.out.println("array3: " + Arrays.toString(array3));

        Arrays.fill(array3, 1);
        System.out.println("array3: " + Arrays.toString(array3));


        //4
        System.out.println("array2: " + Arrays.toString(array2));

        //5
        char[] array4 = {'a', 'b', 'c'};
        System.out.println(array4);
    }
}
