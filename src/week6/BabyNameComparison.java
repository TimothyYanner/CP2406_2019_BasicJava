package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter 3 baby names:");
        String firstName = inputDevice.nextLine();
        String secondName = inputDevice.nextLine();
        String thirdName = inputDevice.nextLine();
        System.out.println(firstName + ' ' + secondName);
        System.out.println(firstName + ' ' + thirdName);
        System.out.println(secondName + ' ' + firstName);
        System.out.println(secondName + ' ' + thirdName);
        System.out.println(thirdName + ' ' + firstName);
        System.out.println(thirdName + ' ' + secondName);
    }
}
