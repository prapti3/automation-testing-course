package ex_16_Array;

public class Lab011_Find_Element_Linear_Search {
    public static void main(String[] args){
//        find the target 67, give index

        int target = 67;
        int[] number = {23,34,67,45,72,69,67};
        for(int i=0;i<number.length; i++){
            if(number[i] == target){
                System.out.println(i);
            }
        }
    }
}
