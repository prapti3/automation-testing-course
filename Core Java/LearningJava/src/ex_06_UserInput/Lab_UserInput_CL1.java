package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_CL1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        String canIVote = age >= 18 ? "YES" : "NO";
        System.out.println(canIVote);




    }
}
