package week5;

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in); // establish input
        System.out.println("Enter 3 integers:"); // prompt the user
        int firstInteger, secondInteger, thirdInteger; // establish each input variable
        int smallInteger, mediumInteger, largeInteger; // establish each comparison variable
        firstInteger = inputDevice.nextInt();
        secondInteger = inputDevice.nextInt();
        thirdInteger = inputDevice.nextInt();
        if (firstInteger < secondInteger) {
            if (firstInteger < thirdInteger) {
                smallInteger = firstInteger;
                if (secondInteger < thirdInteger) {
                    mediumInteger = secondInteger;
                    largeInteger = thirdInteger;
                } else {
                    mediumInteger = thirdInteger;
                    largeInteger = secondInteger;
                }
            } else {
                smallInteger = thirdInteger;
                mediumInteger = firstInteger;
                largeInteger = secondInteger;
            }
        } else if (secondInteger < thirdInteger) {
            smallInteger = secondInteger;
            if (firstInteger < thirdInteger) {
                mediumInteger = firstInteger;
                largeInteger = thirdInteger;
            } else {
                mediumInteger = thirdInteger;
                largeInteger = firstInteger;
            }
        } else {
            smallInteger = thirdInteger;
            mediumInteger = secondInteger;
            largeInteger = firstInteger;
        }
        System.out.println("Ascending Order: " + smallInteger + " " + mediumInteger + " " + largeInteger);
        System.out.println("Descending Order: " + largeInteger + " " + mediumInteger + " " + smallInteger);
    }
}
