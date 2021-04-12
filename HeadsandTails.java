////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160178 Computer Science I
//Homework 8.11
//3/24/2021
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package edu.arapahoe.CSC160;

import java.util.Scanner;

public class HeadsandTails {
    public static void main(String[] args) {

        int [] [] matrix = new int[3][3];               //Initializes 3x3 array and Scanner prompt
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511");
        int num = input.nextInt();
        String bin = Integer.toBinaryString(num);       //Converts integer input to binary string and pads with 0s
        while(bin.length()<9){
            bin = '0' + bin;
        }

        int index = 0;                                  //Counting index for assignment

        for (int row = 0; row < matrix.length; row++){  //Assigns digits of binary number to array
            for (int column = 0; column < matrix.length; column++){
                int value = bin.charAt(index);
                matrix[row][column] = value;
                index++;
            }
        }

        //Turns values from array into T and H and prints in format. Values are in ASCII: 49 and 48 instead of 1 and 0
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                if(matrix[i][j]==48) {
                    System.out.print("H ");
                }
                else if(matrix[i][j]==49){
                    System.out.print("T ");
                }
            }
        }
    }
}
