package week5;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter an even number >>> ");
        int userInput = inputDevice.nextInt();
        while (userInput != 999) {
            if (userInput % 2 == 0) {
                System.out.println("Good Job!");
            } else {
                System.out.println("Try Again");
            }
            System.out.print("Enter an even number >>> ");
            userInput = inputDevice.nextInt();
        }
    }
}
