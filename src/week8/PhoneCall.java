package week8;

public abstract class PhoneCall {
    protected String phoneNumber;
    protected double price;

    PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        price = 0.0;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }
    double getPrice() {
        return price;
    }
    abstract void displayInformation();
}
