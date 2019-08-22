package week3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Random random = new Random();
    int secret;
    int count;
    int wins;

    public static void main(String[] args) {
        Game game = new Game(5, 3);
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Guess the number >>> ");
        int numberGuess = inputDevice.nextInt();
        game.makeGuess(numberGuess);
        if (game.wins == 1) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost");
        }
    }

    void makeGuess(int value) {
        if (value <= 10 && value > 0) {
            this.count += 1;
            this.wins += 1;
        } else {
            this.count += 1;
        }
    }

    public Game(int min, int max) {
        this.secret = random.nextInt((max - min) + 1 + min);
    }
}
