package week7;

public class SugarSmashPlayer {
    protected int idNumber;
    protected String screenName;
    protected int[] highScores;

    SugarSmashPlayer(int idNumber, String screenName) {
        this.idNumber = idNumber;
        this.screenName = screenName;
        highScores = new int[10];
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getHighScores(int level) {
        return highScores[level - 1];
    }

    public void setHighScores(int level, int score) {
        if (level < 1 || level > 10) {
            System.out.println("That level does not exist, please choose from levels 1 - 10");
        } else{
            if (level > 1) {
                boolean checkAble = true;
                int i;
                for (i = 0; i < level - 1; ++i) {
                    if (highScores[i] < 100) {
                        checkAble = false;
                    }
                }
                if (checkAble) {
                    this.highScores[level - 1] = score;
                } else {
                    System.out.println("You have not completed the previous level");
                }
            } else {
                this.highScores[0] = score;
            }
        }
    }
}
