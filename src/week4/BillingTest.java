package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillingTest {
    @Test void checkComputeBill() {
        Billing billing = new Billing();
        double photoBookPrice = 5.50;
        int numberPhotoBooks = 6;
        double couponValue = 2.23;

        // Test the single parameter version of computeBill()
        double singleParameterReturn;
        singleParameterReturn = billing.computeBill(photoBookPrice);
        assertEquals(5.94, singleParameterReturn);

        // Test the double parameter version of computeBill()
        double doubleParameterReturn;
        doubleParameterReturn = billing.computeBill(photoBookPrice, numberPhotoBooks);
        assertEquals(35.64, doubleParameterReturn);

        // Test the triple parameter version of computeBill()
        double tripleParameterReturn;
        tripleParameterReturn = billing.computeBill(photoBookPrice, numberPhotoBooks, couponValue);
        assertEquals(33.2316, tripleParameterReturn);
    }
}