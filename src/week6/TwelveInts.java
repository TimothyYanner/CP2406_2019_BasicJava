package week6;

import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        int[] array = new int[12];
        System.out.println("Enter 12 numbers:");
        int x = 0;
        while (x < 12) {
            int num = inputDevice.nextInt();
            array[x] = num;
            x += 1;
        }
        int i;
        for (i = 0; i < 12; ++i) {
            System.out.print(array[i]);
            if (i == 11) {
                System.out.println(" ");
            } else {
                System.out.print(" ");
            }
        }
        for (i = 11; i >= 0; --i) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
