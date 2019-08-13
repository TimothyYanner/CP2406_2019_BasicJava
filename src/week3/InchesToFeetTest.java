package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesToFeetTest {
    @Test
    void checkFeetConversion() {
        InchesToFeet inchesToFeet = new InchesToFeet();
        assertEquals(86, inchesToFeet.inches);
    }
    @Test void checkConvertMethod() {
        InchesToFeet inchesToFeet = new InchesToFeet();
        inchesToFeet.convertInches(86);
        assertEquals(7, inchesToFeet.numberFeet);
        assertEquals(2, inchesToFeet.numberInches);
    }
}