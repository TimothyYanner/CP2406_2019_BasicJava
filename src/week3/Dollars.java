package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        int numberDollars;
        double numberTwenty;
        double numberTen;
        double numberFive;
        double numberOne;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a number of dollars >>> ");
        numberDollars = inputDevice.nextInt();
        numberTwenty = numberDollars / 0.2;
        numberTen = numberDollars / 0.1;
        numberFive = numberDollars / 0.05;
        numberOne = numberDollars / 0.01;
        System.out.println("The number of 20c coins is: " + numberTwenty);
        System.out.println("The number of 10c coins is: " + numberTen);
        System.out.println("The number of 5c coins is: " + numberFive);
        System.out.println("The number of 1c coins is: " + numberOne);
    }
}
