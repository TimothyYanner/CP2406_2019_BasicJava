package week7;

public class BaseballGame {
    protected String team1;
    protected String team2;
    protected int[] scores;

    BaseballGame(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        scores = new int[9];
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getScores(int inning) {
        return scores[inning - 1];
    }

    public void setScores(int inning, int score) {
        if (inning < 1 || inning > 9) {
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
