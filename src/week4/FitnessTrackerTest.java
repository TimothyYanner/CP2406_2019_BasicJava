package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FitnessTrackerTest {
    @Test void defaultConstructorTest() {
        FitnessTracker fitnessTracker = new FitnessTracker();

        // Test the default fitnessActivity
        String fitnessActivity = fitnessTracker.getFitnessActivity();
        assertEquals("running", fitnessActivity);

        // Test the default number of minutes
        int numberMinutes = fitnessTracker.getNumberMinutes();
        assertEquals(0, numberMinutes);

        // Test the default currentDate
        String currentDate = fitnessTracker.getCurrentDate();
        assertEquals("22/08/2019", currentDate);
    }

    @Test void initialValueConstructorTest() {
        FitnessTracker fitnessTracker = new FitnessTracker("jogging", 3, "24/08/2019");

        // Test the initial fitnessActivity
        String fitnessActivity = fitnessTracker.getFitnessActivity();
        assertEquals("jogging", fitnessActivity);

        // Test the initial numberMinutes
        int numberMinutes = fitnessTracker.getNumberMinutes();
        assertEquals(3, numberMinutes);

        // Test the initial currentDate
        String currentDate = fitnessTracker.getCurrentDate();
        assertEquals("24/08/2019", currentDate);
    }
}