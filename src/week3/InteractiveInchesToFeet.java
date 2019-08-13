package week3;
import java.util.Scanner;

public class InteractiveInchesToFeet {
    public static void main(String[] args) {
        int numberInches;
        int numberFeet;
        int numberInchesLeft;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter a number of inches >>> ");
        numberInches = inputDevice.nextInt();
        numberFeet = numberInches / 12;
        numberInchesLeft = numberInches % 12;
        System.out.println("That is equal to " + numberFeet + " feet and " + numberInchesLeft + " inches");
    }
}
