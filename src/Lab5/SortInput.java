package Lab5;

import java.io.*;
import java.util.Arrays;

public class SortInput {
    public static void main(String[] args) throws IOException{
        File inFile = new File("C:\\Users\\tyk1304245946\\Desktop\\input8.in");
        FileInputStream fos = new FileInputStream(inFile);
        StreamTokenizer re = new StreamTokenizer(new BufferedReader(new InputStreamReader(fos)));


        PrintWriter out = null;
        try {
            out = new PrintWriter("C:\\Users\\tyk1304245946\\Desktop\\input8_1.in");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        re.nextToken();
        int n = (int) re.nval;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            re.nextToken();
            a[i] = (int) re.nval;
        }

        Arrays.stream(a).sorted();

        for (int i = 0; i < n; i++) {
            //System.out.printf("%d ", a[i]);
            out.printf("%d ", a[i]);
        }



    }
}
