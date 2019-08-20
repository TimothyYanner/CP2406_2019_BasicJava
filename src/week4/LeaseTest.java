package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {
    @Test void basicTest() {
        Lease lease = new Lease();

        // Call all setter methods to assign new values to lease attributes
        lease.setTenantName("Jim");
        lease.setApartmentNumber(12);
        lease.setMonthlyRent(899.43);
        lease.setTermOfLease(8);

        // Call all getter methods to retrieve attributes
        String tenantName = lease.getTenantName();
        int apartmentNumber = lease.getApartmentNumber();
        double monthlyRent = lease.getMonthlyRent();
        int termOfLease = lease.getTermOfLease();

        // Use assert statements to check the getter and setter methods worked
        assertEquals("Jim", tenantName);
        assertEquals(12, apartmentNumber);
        assertEquals(899.43, monthlyRent);
        assertEquals(8, termOfLease);
    }

    @Test void checkAddPetFee() {
        Lease lease = new Lease();
        lease.addPetFee();

        // Retrieve the changed monthlyRent value and use an assert statement to check it is correct
        double monthlyRent = lease.getMonthlyRent();
        assertEquals(510.0, monthlyRent);
    }
}