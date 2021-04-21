package arapahoe.edu.CSC160;

import java.util.Scanner;
public class AdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + "? Type your answer>> ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 + number2 == answer)
            System.out.println("Correct!!");
        else {
            System.out.println("Incorrect :(");
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        }

    }
}
