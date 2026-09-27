package javaStrings.level2;
import java.util.Scanner;
import java.lang.Math;
/*
   Rock paper Scissor game between computer and user
   Conditions : rock-scissors: rock will win (rock crushes scissors)
                rock-paper: paper wins (paper covers rock)
                scissors-paper: scissors win (scissors cuts paper)
 */
public class RockPaperScissor {
    // create a method to find the computer choice
    public static int computerChoice() {
        int choice = (int)(Math.random() * 3) + 1;
        return choice;
    }
    // method to find the winner between user and computer
    public static String winner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "Draw";
        } else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // average and percentage of wins of user and computer
    public static String[][] average(int n, int userWinCount, int computerWinCount) {
        String[][] result = new String[2][3];

        result[0][0] = "User";
        result[0][1] = String.valueOf((double) userWinCount / n);
        result[0][2] = String.valueOf((double) userWinCount / n * 100);
        result[1][0] = "Computer";
        result[1][1] = String.valueOf((double) computerWinCount / n);
        result[1][2] = String.valueOf((double) computerWinCount / n * 100);

        return result;
    }

    // method to display results
    public static void display(String[][] result) {
        System.out.println("\nPlayer\t\tAverage\t\tPercentage");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s\t\t%s\t\t%s%%%n", result[i][0], result[i][1], result[i][2]);
        }
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //create a variable and take user input
        System.out.print("Enter the number of games: ");
        int n = input.nextInt();
        int userWinCount = 0;
        int computerWinCount = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("\nGame " + i);
            System.out.println("1. Rock\n2. Paper\n3. Scissors");

            int userChoice;
            do {
                System.out.print("Enter your choice: ");
                userChoice = input.nextInt();
                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Invalid choice. Enter 1, 2 or 3.");
                }
            } while (userChoice < 1 || userChoice > 3);

            int computer = computerChoice();
            String winnerResult = winner(userChoice, computer);
            String userChoiceName = "";
            String computerChoiceName = "";
            if (userChoice == 1) {
                userChoiceName = "Rock";
            } else if (userChoice == 2) {
                userChoiceName = "Paper";
            } else {
                userChoiceName = "Scissors";
            }

            if (computer == 1) {
                computerChoiceName = "Rock";
            } else if (computer == 2) {
                computerChoiceName = "Paper";
            } else {
                computerChoiceName = "Scissors";
            }

            System.out.println("User choice     : " + userChoiceName);
            System.out.println("Computer choice : " + computerChoiceName);
            System.out.println("Winner          : " + winnerResult);
            if (winnerResult.equals("User")) {
                userWinCount++;
            } else if (winnerResult.equals("Computer")) {
                computerWinCount++;
            }
        }

        String[][] result = average(n, userWinCount, computerWinCount);
        display(result);

        input.close();
    }
}