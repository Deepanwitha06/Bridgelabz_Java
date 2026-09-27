package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to create a deck of cards
   initialize the deck, shuffle the deck and distribute the cards to players
*/
public class Cards {
    // A method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits,String[] ranks) {
        int numOfCards=suits.length*ranks.length;
        String[] deck=new String[numOfCards];
        int index=0;
        for(int i=0;i<suits.length;i++) {
            for(int j=0;j<ranks.length;j++) {
                deck[index]=ranks[j]+" of "+suits[i];
                index++;
            }
        }
        return deck;
    }

    // A method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n=deck.length;
        for(int i=0;i<n;i++) {
            int randomCardNumber=i+(int)(Math.random()*(n-i));
            String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
        return deck;
    }

    // A method to distribute the cards to players
    public static String[][] distributeCards(String[] deck,int numberOfPlayers,int numberOfCards) {
        if(numberOfPlayers<=0) {
            return null;
        }
        if(numberOfCards<=0 || numberOfCards>deck.length) {
            return null;
        }
        if(numberOfCards%numberOfPlayers!=0) {
            return null;
        }
        int cardsPerPlayer=numberOfCards/numberOfPlayers;
        String[][] players=new String[numberOfPlayers][cardsPerPlayer];
        int index=0;
        for(int i=0;i<numberOfPlayers;i++) {
            for(int j=0;j<cardsPerPlayer;j++) {
                players[i][j]=deck[index];
                index++;
            }
        }
        return players;
    }

    // A method to print the players and their cards
    public static void printPlayers(String[][] players) {
        for(int i=0;i<players.length;i++) {
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<players[i].length;j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // Create suits and ranks
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        // Calculate number of cards
        int numOfCards=suits.length*ranks.length;
        // Initialize the deck
        String[] deck=initializeDeck(suits,ranks);
        // Shuffle the deck
        deck=shuffleDeck(deck);

        // Take number of players and cards as input
        System.out.print("Enter number of players: ");
        int numberOfPlayers=input.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer=input.nextInt();
        int cardsToDistribute=numberOfPlayers*cardsPerPlayer;
        if(cardsToDistribute>numOfCards) {
            System.out.println("The number of cards cannot be distributed");
        }else{
            String[][] players=distributeCards(deck,numberOfPlayers,cardsToDistribute);
            if(players!=null) {
                printPlayers(players);
            }else{
                System.out.println("The cards cannot be equally distributed");
            }
        }

        input.close();
    }
}