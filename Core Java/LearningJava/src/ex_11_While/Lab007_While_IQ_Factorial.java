package ex_11_While;

import java.util.Scanner;

public class Lab007_While_IQ_Factorial {
    public static void main(String[] args) {
//        Factorial Program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\n Enter the number : ");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the int you fool! ");
            return;
        }
        int number = scanner.nextInt();
        long factorial = 1;

        if(number < 0){
            System.out.println("Negative Factorial is not allowed!");
            return;
        }
        if(number <=0){
            System.out.println(factorial);
        }
        else{
//calculate the factorial
            for(int i = 1; i <= number; i++){
                factorial *= i;

            }
        }
        System.out.println("Factorial is -> "+ factorial);
    }
}
