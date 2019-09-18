package week8;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[10];
        int i;
        for (i = 0; i < phoneCalls.length; ++i) { // generate incoming and outgoing calls
            PhoneCall phoneCall;
            if (i % 2 == 0) {
                phoneCall = new IncomingPhoneCall("0101010101");
            } else {
                phoneCall = new OutgoingPhoneCall("0202020202", 10);
            }
            phoneCalls[i] = phoneCall;
        }
        for (i = 0; i < phoneCalls.length; ++i) {
            phoneCalls[i].displayInformation();
        }
    }
}
