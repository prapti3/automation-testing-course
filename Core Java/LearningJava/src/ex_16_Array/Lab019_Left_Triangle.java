package ex_16_Array;

public class Lab019_Left_Triangle {
    public static void main(String[] args){

//        ***
//        **
//        *

     int n =3;
     for(int i =n;i>0;i--){
         for(int j = 1; j<=i;j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
