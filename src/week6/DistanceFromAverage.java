package week6;

import java.util.Scanner;
import java.lang.Math;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        double[] userArray = new double[1000];
        System.out.print("Enter a double up to 20 >>> ");
        double userNumber = inputDevice.nextDouble();
        int numberDoubles = 0;
        double avg = 0;
        while ((int) userNumber != 99999) {
            System.out.print("Enter a double up to 20 >>> ");
            userNumber = inputDevice.nextDouble();
            if (userNumber == 99999) {
                break;
            } else {
                userArray[numberDoubles] = userNumber;
                numberDoubles += 1;
                avg = (avg + userNumber) / 2.0;
            }
        }
        double[] averageArray = new double[numberDoubles + 1];
        int i;
        double distance;
        for (i = 0; i <= numberDoubles; ++i) {
            distance = Math.abs(userArray[i] - avg);
            averageArray[i] = distance;
        }
        for (i = 0; i <= numberDoubles; ++i) {
            System.out.println("Entered value: " + userArray[i] + " Distance from Average: " + averageArray[i]);
        }
    }
}
