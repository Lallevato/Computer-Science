///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160178 Computer Science I
//Final Project 30 or Bust!
//4/12/2021
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package edu.arapahoe.CSC160;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Creates Scanner object
        Scanner input = new Scanner(System.in);

        //Takes names as input and assigns them to Player1 and Player2 strings
        System.out.println("Enter Player 1's name: ");
        String Player1 = input.nextLine();
        System.out.println("Enter Player 2's name: ");
        String Player2 = input.nextLine();

        //Prints welcome message and tutorial including player names
        System.out.println("Hello " + Player1 + " and " + Player2 + "!\n");
        System.out.println("The goal of this game is to get your score to exactly 30. You will roll two dice, and you " +
                "have the option to add either the value of a single die or the total of both dice to your score. If you go over" +
                " 30, you restart at 0. If you hit exactly 30, you win!\n\nAre you ready? Let's go!\n");

        //Sets scores for Player1 and Player2 to 0
        int score1 = 0;
        int score2 = 0;

        //Main gameplay loop. Alternates players taking turns until one wins, and only stops once a player has exactly 30.
        while (true) {

            //Calls turn() method for Player1 and score1
            score1 = turn(Player1, score1);

            //Checks score values against 30

            //If score is 30, the player wins and the game ends
            if (score1 == 30) {
                System.out.println(Player1 + " wins!");
                break;
            }

            //If score is greater than 30, displays message and sets score back to 30
            else if (score1 > 30) {
                System.out.println(Player1 + "'s score is above 30! They will restart from 0.\n");
                score1 = 0;
            }

            //If score is less than 30, the other player takes their turn

            //Same as above, but with Player2 instead of Player1
            score2 = turn(Player2, score2);
            if (score2 == 30) {
                System.out.println(Player2 + " wins!");
                break;
            } else if (score2 > 30) {
                System.out.println(Player2 + "'s score is above 30! They will restart from 0.");
                score2 = 0;
            }
        }

    }

    //Method for rolling die; returns value between 1 and 6 inclusive
    public static int roll(int x) {
        Random r = new Random();
        int value = r.nextInt(6) + 1;
        x = value;
        return x;
    }

    //Method for each players turn to be called in main
    public static int turn(String Player, int score) {

        //Creates Scanner object
        Scanner input = new Scanner(System.in);

        //Tells player it is their turn and displays score
        System.out.println(Player + ", its your turn!\n");
        System.out.println("Your score is " + score + "\n");

        //Sets both dice to 0
        int roll1 = 0;
        int roll2 = 0;

        //Calls roll() method on both dice to assign them random value between 1 and 6, inclusive
        roll1 = roll(roll1);
        roll2 = roll(roll2);

        //Assigns roll1 plus roll2 as the total
        int total = roll1 + roll2;

        //Displays roll1, roll2, and total. Asks user to choose option 1, 2, or 3
        System.out.println("Die 1: " + roll1);
        System.out.println("Die 2: " + roll2);
        System.out.println("Total: " + total);
        System.out.println("\nWould you like to add (1) Die 1, (2) Die 2, or (3) the total of both? Enter a number: ");

        //Accepts user choice 1, 2, or 3
        int choice = input.nextInt();

        //If user value is 1, add roll1 to score
        if (choice == 1) {
            score += roll1;
        }

        //If user value is 2, add roll2 to score
        else if (choice == 2) {
            score += roll2;
        }

        //If user value is 3, add total to score
        else if (choice == 3) {
            score += total;
        }

        //Display score at the end of turn
        System.out.println(Player + "'s score is " + score + "\n");

        return score;
    }

}