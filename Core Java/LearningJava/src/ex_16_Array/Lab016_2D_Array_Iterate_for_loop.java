package ex_16_Array;

public class Lab016_2D_Array_Iterate_for_loop {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        3x3
//        R -> 3
//        C -> 3

//        1,2,3
//        4,5,6
//        7,8,9
        System.out.println(matrix.length );

        for(int i=0;i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " | ");
//                System.out.print("*");
            }
            System.out.println();
        }
    }
}
