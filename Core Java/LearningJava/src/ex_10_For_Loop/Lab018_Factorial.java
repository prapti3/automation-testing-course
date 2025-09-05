package ex_10_For_Loop;

import java.util.Scanner;

public class Lab018_Factorial {
    public static void main(String[] args) {
//        Factorial program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\n Enter the number :");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the int you fool!");
            return;
        }
        int number = scanner.nextInt();
        long factorial = 1;

        if(number < 0){
            System.out.println("Negative Factorial is not Allowed!!");
        }
        else{
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;

            }
        }
        System.out.println("Factorial is --> "+factorial );
    }
}
