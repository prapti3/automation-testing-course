package ex_11_While;
import java.util.Random;
import java.util.Scanner;


public class Lab008_While_Guessing_Game {
    public static void main(String[] args) {

//        Guess a number between 1 and 100
//        random => 1 to 100

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
//        System.out.println("Guess number is: " + numberToGuess);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to guess: ");


        int guess;
        int attempts = 0;

        while(true){
            guess = scanner.nextInt();
            attempts++;

            if(guess==numberToGuess){
                System.out.println("Correct guess! it in "+ attempts + " attempts");
            }else if(guess>numberToGuess){
                System.out.println("Too High, try again");
            }
            else if(guess < numberToGuess){
                System.out.println("Too Low, try again");
            }
        }

    }
}
