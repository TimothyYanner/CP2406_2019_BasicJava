package week5;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in); // establish input instance
        System.out.print("Enter an integer >>> "); // prompt the user to write an integer
        int userInteger = inputDevice.nextInt(); // set input to user's integer response
        if (userInteger % 2 == 0) { // check if even
            System.out.println("The integer is even");
        } else {
            System.out.println("The integer is odd");
        }
    }
}
