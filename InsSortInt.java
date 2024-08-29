//Vikram Raju, 8/28/24

import java.io.*;
import java.util.ArrayList;

public class InsSortInt {
    public static void main(String[] args) throws IOException {
        File ints = new File("randInts.txt");
        ArrayList<String> vals = new ArrayList<String>();
        FileReader reader = new FileReader(ints);
        BufferedReader in = new BufferedReader(reader);
        String k;
        int listLen = 0;
        while ((k = in.readLine()) != null) {
            vals.add(k);
            listLen++;
        }
        int[] arr = new int[listLen];
        for (int i = 0; i < vals.size(); i++) {
            arr[i] = Integer.parseInt(vals.get(i));
        }
        insSort(arr);
        System.out.println("Smallest value: " + arr[0] + "\nLargest value: " + arr[arr.length - 1]);
        reader.close();
        in.close();
    }
    public static void insSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int count = i - 1;
            int key = arr[i];
            while (count >= 0 && arr[count] > key) {
                arr[count + 1] = arr[count];
                count--;
            } arr[count + 1] = key;
        }
    }
}
