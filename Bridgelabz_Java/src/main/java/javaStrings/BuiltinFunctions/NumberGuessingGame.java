package javaStrings.BuiltinFunctions;
import java.util.Scanner;
import java.util.Random;
/*
     create a class where the computer guess the number user thinks
     prgm should be modular
     the user gives feedback as high.low.correct
 */
public class NumberGuessingGame {
    // a method to guess number from 100
    public static int firstGuess(){
        Random random= new Random();
        int guess=random.nextInt(100)+1;
        return guess;
    }

    // Generate the next guess within the possible range
    public static int nextGuess(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    //a method to say guess is right
    public static void correctGuess(int guess){
        System.out.println("Hence the number is "+guess);
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);
        int min=1;
        int max=100;
        int guess=firstGuess();
        while(true) {
            System.out.print("Number:" + guess);
            System.out.println("Feedback options:\nOption 1:High Guess\nOption 2:Low Guess\n3.Correct GUess\nUser feedback: ");
            int feedback = input.nextInt();
            if (feedback==1) {
                max =guess-1;
                guess = nextGuess(min, max);
            } else if (feedback == 2) {
                min = guess + 1;
                guess = nextGuess(min, max);
            } else if (feedback == 3) {
                correctGuess(guess);
                break;
            }
        }

        input.close();
    }
}
