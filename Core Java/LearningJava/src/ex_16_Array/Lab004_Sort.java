package ex_16_Array;

import java.util.Arrays;

public class Lab004_Sort {
    public static void main(String[] args){

//        Sorting in static array

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 4;
        arr[3] = 5;

        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
