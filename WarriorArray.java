////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160178 Computer Science I
//Homework 10
//3/31/2021
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package edu.arapahoe.CSC160;

import java.util.Random;
import java.util.Scanner;

public class WarriorArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Creates array and assigns nicknames to Warrior objects

        WarriorFred warriorList[] = new WarriorFred[5];
        warriorList[0] = new WarriorFred("Tom Hanks");
        warriorList[1] = new WarriorFred("Obi-Wan Kenobi");
        warriorList[2] = new WarriorFred("Doug Lundin");
        warriorList[3] = new WarriorFred("Joe Biden");
        warriorList[4] = new WarriorFred("Joe Mama");

        //While loop functions as menu, exits program if "exit" is input

        while (true) {
            String user = "";
            System.out.println("Press Enter to run, or 'exit' to quit>>");
            user += input.nextLine();
            if (user.equals("")) {

                //Gives each Warrior a random amount of damage between 1 and 10, inclusive, and then calls the
                //printInfo() Warrior method for that Warrior.

                for (int i = 0; i < warriorList.length; i++) {
                    Random rand = new Random();
                    int random_damage = rand.nextInt(10) + 1;
                    warriorList[i].takeDamage(random_damage);
                    warriorList[i].printInfo();
                }
                System.out.println();

            } else if (user.contains("exit")) {
                System.exit(0);
            } else {
                System.out.println("Enter a valid input.");
            }
        }
    }
}