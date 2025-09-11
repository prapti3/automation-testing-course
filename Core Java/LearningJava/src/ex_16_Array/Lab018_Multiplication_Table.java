package ex_16_Array;
import java.util.*;

public class Lab018_Multiplication_Table {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for(int i =0; i < num ; i++){
            for(int j =0; i < num; j++){
                System.out.print(i*j + " | ");
            }
            System.out.println();
        }




    }
}
