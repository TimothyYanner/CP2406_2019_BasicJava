package week5;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a value to count by >>> ");
        int countValue = inputDevice.nextInt();
        int i;
        for (i = countValue; i <= countValue * 100; i += countValue) {
            if (i % (countValue * 10) == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
