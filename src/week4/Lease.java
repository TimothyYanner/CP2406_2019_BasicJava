package week4;

public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int termOfLease;

    Lease() {
        tenantName = "Fred";
        apartmentNumber = 4;
        monthlyRent = 500.0;
        termOfLease = 6;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getTermOfLease() {
        return termOfLease;
    }

    public void setTermOfLease(int termOfLease) {
        this.termOfLease = termOfLease;
    }

    public void addPetFee() {
        this.monthlyRent += 10.0;
        explainPetPolicy();
    }

    private static void explainPetPolicy() {
        System.out.println("Having a pet adds $10 to your monthly rent");
    }
}
