package ex_16_Array;

public class Lab009_Sum_of_Arrays {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        int sum =0;

        for(int i=0;i<array.length; i++){
            sum = array[i] + sum;
        }
        System.out.println("Sum of numbers in Array : "+ sum);
    }
}
