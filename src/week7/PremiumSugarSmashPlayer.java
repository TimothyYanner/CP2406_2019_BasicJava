package week7;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    PremiumSugarSmashPlayer(int idNumber, String screenName) {
        super(idNumber, screenName);
        highScores = new int[50];
    }

    @Override
    public void setHighScores(int level, int score) {
        if (level < 1 || level > 50) {
            System.out.println("That level does not exist, please choose from levels 1 - 50");
        } else {
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
