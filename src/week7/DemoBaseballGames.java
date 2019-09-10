package week7;

public class DemoBaseballGames {
    public static void main(String[] args) {
        BaseballGame regGame = new BaseballGame("Tigers", "Lions");
        regGame.setScores(10, 9); // should print inning does not exist error
        regGame.setScores(9, 9); // should print previous innings not filled error
        regGame.setScores(1, 8);
        regGame.setScores(2, 19);
        System.out.println(regGame.getScores(2)); // should print 19

        HighSchoolBaseballGame highGame = new HighSchoolBaseballGame("Cats", "Dogs");
        highGame.setScores(8, 9); // should print inning does not exist error
        highGame.setScores(7, 10); // should print previous innings not filled error
        highGame.setScores(1, 8);
        highGame.setScores(2, 11);
        System.out.println(highGame.getScores(2)); // should print 11

        LittleLeagueBaseballGame littleGame = new LittleLeagueBaseballGame("Chairs", "Tables");
        littleGame.setScores(7, 9); // should print inning does not exist error
        littleGame.setScores(6, 9); // should print previous innings not filled error
        littleGame.setScores(1, 9);
        littleGame.setScores(2, 9);
        System.out.println(littleGame.getScores(2)); // should print 9
    }
}
