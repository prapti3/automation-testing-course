package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInupt_CL1 {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner scan = new Scanner(System.in);


        int age = scan.nextInt();
        String canIVote = age >= 18 ? "YES" : "NO";
        System.out.println(canIVote);

    }
}
