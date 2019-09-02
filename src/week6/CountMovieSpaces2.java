package week6;

import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Write your favourite movie quote >>> ");
        String movieQuote = inputDevice.nextLine();
        int i;
        int spaceCount = 0;
        for (i = 0; i < movieQuote.length(); ++i) {
            if (movieQuote.charAt(i) == ' ') {
                spaceCount += 1;
            }
        }
        System.out.print(spaceCount);
    }
}
