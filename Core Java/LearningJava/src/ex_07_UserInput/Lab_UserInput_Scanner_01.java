package ex_07_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.println(name);


        System.out.println("Enter your double:");
        double double_input = scan.nextDouble();
        System.out.println(double_input);
    }
}
