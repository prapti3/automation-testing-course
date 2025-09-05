package Coding_Program;

import java.util.Scanner;

public class CP001_Triangle_Classifier {
    public static void main(String[] args) {
/*
* **✅ Triangle Classifier:**
*
*
* Write a program that classifies a triangle based on its side lengths.
*
* Given three input values representing the lengths of the sides,
*
* determine if the triangle is equilateral (all sides are equal),
* isosceles (exactly two sides are equal),
* or scalene (no sides are equal). Use an if-else statement
*  to classify the triangle
 *
* */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Side1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the Side2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the Side3: ");
        int side3 = scanner.nextInt();

        System.out.println("Side1: "+side1);
        System.out.println("Side2: "+side2);
        System.out.println("Side3: "+side3);

        // Check if valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Classify triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }

        scanner.close();











    }
}
