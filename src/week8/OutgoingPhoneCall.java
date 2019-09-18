package week8;

public class OutgoingPhoneCall extends PhoneCall {
    private int timeOfCall;

    OutgoingPhoneCall(String phoneNumber, int callTimeInMinutes) {
        super(phoneNumber);
        this.timeOfCall = callTimeInMinutes;
        price = 0.04 * callTimeInMinutes;
    }

    void displayInformation() {
        System.out.println("The phone call from " + phoneNumber + " costs a rate of $0.04 per minute. The call was "
                + timeOfCall + " minutes long, and costs $" + price);
    }
}
