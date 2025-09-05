package ex_08_If_Condition;

import java.util.Scanner;

public class Lab000_if {
    public static void main(String[] args) {
        System.out.print("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Allowed to Vote!!!!!");
        }
    }
}
