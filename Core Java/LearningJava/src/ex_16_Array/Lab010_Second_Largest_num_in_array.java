package ex_16_Array;

import java.util.Arrays;

public class Lab010_Second_Largest_num_in_array {
    public static void main(String[] args){
//        find the second-largest number in an array.

        int[] number = {1,2,3,4,5,6};
        Arrays.sort(number);

        System.out.println(number[number.length-2]);
        System.out.println(number[number.length-3]);

    }
}
