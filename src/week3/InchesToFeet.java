package week3;

public class InchesToFeet {
    final int inches = 86;
    int numberFeet;
    int numberInches;
    void convertInches(int value) {
        numberInches = value % 12;
        numberFeet = value / 12;
    }
}
