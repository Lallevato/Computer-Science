////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160178 Computer Science I
//Homework 7.34
//3/10/2021
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package edu.arapahoe.CSC160;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SortStringUsingArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	    System.out.println("Enter a string to be sorted, or 'quit' to quit: ");

	    //While loop continually asks for string, which is passed to sort() method, assigned to a variable, and printed.
        //Loop ends if "quit" is entered.

	    while (true) {
            String word = input.nextLine();
            if (word.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                String sortedmessage = sort(word);
                System.out.println(sortedmessage);
                System.out.println("\nEnter another string: ");
            }
        }
    }

    //sort() method turns string argument into array, uses the built-in Arrays.sort() method to sort the array, and then
    //turns the array back into a string which is returned.

    public static String sort(String s){
        s = s.toLowerCase();
        char[] list = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            list[i] = s.charAt(i);
        }
        Arrays.sort(list);

        String sorted = new String(list);
        return sorted;

    }
}