////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160179 Computer Science I
//Homework 4: Phone Key Pad
//2/17/2021
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package arapahoe.edu.CSC160;

import java.util.Scanner;

public class CountVowelsandConsonants {

    public static void main(String[] args) {

        System.out.println("Enter a message! >>"); //Accepts message and turns all to uppercase
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        message = message.toUpperCase();
        int len = message.length();                 //Gets length of string

        int vowels = 0;                             //Sets vowels and consonants to 0
        int consonants = 0;

        for(int i = 0; i < len; i++){

            char letter = message.charAt(i);        //Compares letter at iteration index to list of characters

            switch (letter){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowels += 1;                    //If vowel, adds vowel. If consonant, adds consonant
                    break;

                case 'B':
                case 'C':
                case 'D':
                case 'F':
                case 'G':
                case 'H':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    consonants += 1;
                    break;
            }
        }           //Prints out the number of vowels and consonants
        System.out.println("The number of vowels is " + vowels + "\nThe number of consonants is " + consonants);
    }
}
