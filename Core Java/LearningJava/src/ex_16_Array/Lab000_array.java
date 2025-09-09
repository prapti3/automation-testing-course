package ex_16_Array;

public class Lab000_array {
    public static void main(String[] args) {

        // 2 ways to describe array

        // 1. Static array
        int[] arr1 = new int[5]; // declaration and instantiation
        arr1[0] = 10; // initialization
        arr1[1] = 20;
        System.out.println(arr1[0]);
        System.out.println("Length of array arr1 is : " + arr1.length);

        String[] str = new String[4];
        str[0] = "Prapti";
        str[1] = "Hello";

        System.out.println(str[0]);
        System.out.println(str.length);






        // 2. Dynamic array
        int[] arr2 = {10, 20, 30, 40, 50}; // declaration, instantiation and initialization
        System.out.println(arr2[3]);

        System.out.println(arr2.length); // length of array


    }
}
