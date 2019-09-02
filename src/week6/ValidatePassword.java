package week6;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        int upperCaseCount;
        int lowerCaseCount;
        int digitCount;
        System.out.println("Enter a password with at least 2 uppercase letters, 2 lowercase letters and 2 digits:");
        String password;
        boolean correct = false;
        while (!correct) {
            password = inputDevice.nextLine();
            int i;
            upperCaseCount = 0;
            lowerCaseCount = 0;
            digitCount = 0;
            for (i = 0; i < password.length(); ++i) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upperCaseCount += 1;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lowerCaseCount += 1;
                } else if (Character.isDigit(password.charAt(i))) {
                    digitCount += 1;
                }
            }
            if (upperCaseCount >= 2 && lowerCaseCount >= 2 && digitCount >= 2) {
                System.out.print("Password is successful");
                correct = true;
            } else {
                System.out.println("Password is invalid due to:");
                if (upperCaseCount < 2) {
                    System.out.println("- not enough uppercase letters");
                }
                if (lowerCaseCount < 2) {
                    System.out.println("- not enough lowercase letters");
                }
                if (digitCount < 2) {
                    System.out.println("- not enough digits");
                }
                System.out.println("Try again:");
            }
        }
    }
}
