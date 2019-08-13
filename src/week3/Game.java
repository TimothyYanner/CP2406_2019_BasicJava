package week3;

import java.util.Random;

public class Game {
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;
    int count;
    int wins;

    void makeGuess(int value) {
        if (value <= 10 && value > 0) {
            this.count += 1;
            this.wins += 1;
        }
        else {
            this.count += 1;
        }
    }
}
