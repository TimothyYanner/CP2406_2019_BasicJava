package week7;

public class DemoSugarSmash {
    public static void main(String[] args) {
        SugarSmashPlayer regPlayer1 = new SugarSmashPlayer(1, "John");
        regPlayer1.setHighScores(11, 101); // should print level number error message
        regPlayer1.setHighScores(10, 100); // should print previous level error message
        regPlayer1.setHighScores(1, 100);
        regPlayer1.setHighScores(2, 101);
        System.out.println(regPlayer1.getHighScores(2));

        PremiumSugarSmashPlayer premPlayer1 = new PremiumSugarSmashPlayer(2, "Smith");
        premPlayer1.setHighScores(51, 101); // should print level number error message
        premPlayer1.setHighScores(50, 100); // should print previous level error message
        premPlayer1.setHighScores(1, 100);
        premPlayer1.setHighScores(2, 102);
        System.out.println(premPlayer1.getHighScores(2));
    }
}
