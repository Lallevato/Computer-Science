////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160179 Computer Science I
//Homework 4: Phone Key Pad
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package arapahoe.edu.CSC160;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String [] args) {

        System.out.println("Enter a letter: ");  //Prompts for a string
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        answer = answer.toUpperCase();           //String is converted to uppercase
        char letter = answer.charAt(0);          //First character is taken for comparison

        if (letter == 'A' || letter == 'B' || letter == 'C')
            System.out.println("The corresponding number of " + letter + " is 2."); //Checks input against characters

        else if (letter == 'D' || letter == 'E' || letter == 'F')
            System.out.println("The corresponding number of " + letter + " is 3.");

        else if (letter == 'G' || letter == 'H' || letter == 'I')
            System.out.println("The corresponding number of " + letter + " is 4.");

        else if (letter == 'J' || letter == 'K' || letter == 'L')
            System.out.println("The corresponding number of " + letter + " is 5.");

        else if (letter == 'M' || letter == 'N' || letter == 'O')
            System.out.println("The corresponding number of " + letter + " is 6.");

        else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')
            System.out.println("The corresponding number of " + letter + " is 7.");

        else if (letter == 'T' || letter == 'U' || letter == 'V')
            System.out.println("The corresponding number of " + letter + " is 8.");

        else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
            System.out.println("The corresponding number of " + letter + " is 9.");

        else
            System.out.println("Invalid input.");

    }
}
