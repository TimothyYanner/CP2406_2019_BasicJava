package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
    @Test void basicTest() {
        // Create an instance of Student class
        Student student = new Student();
        // Test idNumber getter and setter
        student.setIdNumber(2);
        int idNumber = student.getIdNumber();
        assertEquals(2, idNumber);
        // Test numberCreditHours getter and setter
        student.setNumberCreditHours(30);
        int numberCreditHours = student.getNumberCreditHours();
        assertEquals(30, numberCreditHours);
        // Test numberPoints getter and setter
        student.setNumberPoints(5);
        int numberPoints = student.getNumberPoints();
        assertEquals(5, numberPoints);
    }

    @Test void checkGPA() {
        Student student = new Student();
        // Set the Student object's numberPoints and numberCreditHours values
        student.setNumberPoints(12);
        student.setNumberCreditHours(3);
        // Assign Student object's attributes to usable variables
        int numberPoints = student.getNumberPoints();
        int numberCreditHours = student.getNumberCreditHours();
        // Run the gpa method and check the returned double
        double gpa = student.gpa(numberCreditHours, numberPoints);
        assertEquals(4.0, gpa);
    }

    @Test void initialiser() {
        Student student = new Student();
        // Assign constructor attributes to variables for testing
        int idNumber = student.getIdNumber();
        int numberPoints = student.getNumberPoints();
        int numberCreditHours = student.getNumberCreditHours();
        // Test the constructor values
        assertEquals(9999, idNumber);
        assertEquals(12, numberPoints);
        assertEquals(3, numberCreditHours);
    }
}