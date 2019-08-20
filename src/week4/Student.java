package week4;

public class Student {
    private int idNumber;
    private int numberCreditHours;
    private int numberPoints;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getNumberCreditHours() {
        return numberCreditHours;
    }

    public void setNumberCreditHours(int numberCreditHours) {
        this.numberCreditHours = numberCreditHours;
    }

    public int getNumberPoints() {
        return numberPoints;
    }

    public void setNumberPoints(int numberPoints) {
        this.numberPoints = numberPoints;
    }

    public double gpa(int numberCreditHours, int numberPoints) {
        double gpa;
        gpa = (double)numberPoints / (double)numberCreditHours;
        return gpa;
    }
    Student() {
        idNumber = 9999;
        numberPoints = 12;
        numberCreditHours = 3;
    }
}
