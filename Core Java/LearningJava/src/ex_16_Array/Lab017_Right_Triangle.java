package ex_16_Array;
import java.util.*;

public class Lab017_Right_Triangle {
    public static void main(String[] args){
        // How the pattern we want
        //  n = 3
        // *
        // **
        // ***
        System.out.println("Enter the n : ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
