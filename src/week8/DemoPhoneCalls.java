package week8;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("0407040704");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("1234567891", 12);

        incomingPhoneCall.displayInformation();
        outgoingPhoneCall.displayInformation();
    }
}
