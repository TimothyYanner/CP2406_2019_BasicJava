package week5;

import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Choose one of the following:");
        System.out.println("(1) Park view");
        System.out.println("(2) Golf course view");
        System.out.println("(3) Lake view");
        int userChoice = inputDevice.nextInt();
        int price;
        if (userChoice == 1) {
            price = 150000;
            System.out.println("Park View " + "$" + price);
        } else if (userChoice == 2) {
            price = 170000;
            System.out.println("Golf Course View " + "$" + price);
        } else if (userChoice == 3) {
            price = 210000;
            System.out.println("Lake View " + "$" + price);
        } else {
            price = 0;
            System.out.println("Invalid choice");
        }
    }
}
