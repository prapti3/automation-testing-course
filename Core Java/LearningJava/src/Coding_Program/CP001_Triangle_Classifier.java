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


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of side1 in the triangle");
        int side1 = input.nextInt();
        System.out.println("Please enter the length of side2 in the triangle");
        int side2 = input.nextInt();
        System.out.println("Please enter the length of side3 in the triangle");
        int side3 = input.nextInt();


        if(side1 == side2 || side1 == side3){
            System.out.println("All side are equal!!! - Equilateral Triangle");

        }
        else if(side1 == side2 && side1 == side3){
            System.out.println("Exactly 2 sides are equal!!! - ?Isosceles Triangle");
        }
        else if(side1 == side2 && side1 == side3){}




    }
}
