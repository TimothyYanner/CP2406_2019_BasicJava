package week7;

public class HighSchoolBaseballGame extends BaseballGame {
    HighSchoolBaseballGame(String team1, String team2) {
        super(team1, team2);
        scores = new int[7];
    }

    @Override
    public void setScores(int inning, int score) {
        if (inning < 1 || inning > 7) {
            System.out.println("That inning does not exist - choose from innings 1 to 9");
        } else if (inning > 1) {
            int i;
            boolean checkAble = true;
            for (i = 0; i < inning - 1; ++i) {
                if (scores[i] == 0) {
                    checkAble = false;
                }
            }
            if (checkAble) {
                scores[inning - 1] = score;
            } else {
                System.out.println("You have not registered a score for a previous inning");
            }
        } else {
            scores[0] = score;
        }
    }
}
