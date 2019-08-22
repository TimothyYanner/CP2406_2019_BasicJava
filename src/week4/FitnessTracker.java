package week4;

public class FitnessTracker {

    private String fitnessActivity;
    private int numberMinutes;
    private String currentDate;

    FitnessTracker() {
        fitnessActivity = "running";
        numberMinutes = 0;
        currentDate = "22/08/2019";
    }

    FitnessTracker(String fitnessActivity, int numberMinutes, String currentDate) {
        this.fitnessActivity = fitnessActivity;
        this.numberMinutes = numberMinutes;
        this.currentDate = currentDate;
    }

    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public int getNumberMinutes() {
        return numberMinutes;
    }

    public String getCurrentDate() {
        return currentDate;
    }
}
