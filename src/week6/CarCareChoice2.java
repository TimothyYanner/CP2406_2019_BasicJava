package week6;

import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        String[] services = {"oil", "tir", "bat", "bra"};
        int[] prices = {25, 22, 15, 5};
        System.out.println("Choose from the following services: oil change | tire rotation | battery check | brake inspection");
        String userInput = inputDevice.nextLine();
        while(!checkInput(userInput, services)) {
            System.out.println("That is not a valid option");
            System.out.println("Choose from the following services: oil change | tire rotation | battery check | brake inspection");
            userInput = inputDevice.nextLine();
        }
        int index = checkIndex(userInput, services);
        System.out.print("You have selected " + services[index] + " for $" + prices[index]);
    }

    public static boolean checkInput(String input, String[] array) {
        int i;
        boolean check = false;
        for (i = 0; i < array.length; ++i) {
            if (input.equals(array[i])) {
                check = true;
            }
        }
        return check;
    }

    public static int checkIndex(String input, String[] array) {
        int index = 0;
        int i;
        for (i = 0; i < array.length; ++i) {
            if (input.equals(array[i])) {
                index = i;
            }
        }
        return index;
    }
}
