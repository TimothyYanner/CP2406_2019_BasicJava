package week8;

public class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        price = 0.02;
    }

    void displayInformation() {
        System.out.println("The call coming from " + this.getPhoneNumber() + " has a rate of " + this.price + " and " +
                "a call price of $" + this.price);
    }
}
