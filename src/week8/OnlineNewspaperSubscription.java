package week8;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    void setAddress(String address) {
        int i;
        boolean hasDigit = false;
        for (i = 0; i < address.length(); ++i) {
            if (address.charAt(i) == '@') {
                hasDigit = true;
                continue;
            }
        }
        if (hasDigit) {
            this.address = address;
            rate = 9.0;
        } else {
            System.out.println("The address is invalid; subscription rate has been set to 0");
            rate = 0.0;
        }
    }
}
