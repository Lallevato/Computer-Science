////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160179 Computer Science I
//Homework 5: Craps
//2/24/2021
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package arapahoe.edu.CSC160;

import java.util.Random;

public class Craps {

    public static void main(String[] args) {

        System.out.println("Welcome to Craps!");    //Main method which calls 2 other methods.

        int round1 = firstroll();
        if (round1 != 0) {          //If no point has been established, the next round is not called.
            nextroll(round1);
        }

    }

    public static int roll() {   //Small method for rolling dice used in below methods.
        Random rand = new Random();
        int num = rand.nextInt(6);
        num++;
        return num;

    }

    public static int firstroll() {                 //Method for the first roll of the game. Establishes point if
                                                    //a winning or losing number is not established.
        int point = 0;
        int roll1 = roll();
        int roll2 = roll();
        int sum = roll1 + roll2;
        System.out.println("You rolled " + roll1 + " + " + roll2 + " which equals " + sum);

        switch (sum) {
            case 11:
            case 7:
                System.out.println("You win!");
                break;

            case 2:
            case 3:
            case 12:
                System.out.println("You lose!");
                break;

            default:
                point = sum;
                return point;

        }
        return point;
    }

    public static void nextroll(int point) {   //Method for every roll after the first. Keeps rolling until point or
                                               //losing number is rolled.
        int winloss = 0;
        System.out.println("Point is " + point);
        while (winloss==(0)) {
            int roll1 = roll();
            int roll2 = roll();
            int sum = roll1 + roll2;
            System.out.println("You rolled " + roll1 + " + " + roll2 + " which equals " + sum);

            if (sum == 7) {
                System.out.println("You lose!");
                winloss = 1;
            }

            if (sum == point) {
                System.out.println("You win!");
                winloss = 2;
            }
        }
    }
}