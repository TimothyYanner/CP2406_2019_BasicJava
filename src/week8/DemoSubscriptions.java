package week8;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalNewspaperSubscription = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onlineNewspaperSubscription = new OnlineNewspaperSubscription();

        physicalNewspaperSubscription.setName("John");
        physicalNewspaperSubscription.setAddress("Smith Drive"); // should display error message
        System.out.println(physicalNewspaperSubscription.getRate()); // should be 0.0
        physicalNewspaperSubscription.setAddress("4 Smith Drive");
        System.out.println(physicalNewspaperSubscription.getName() + " lives on " +
                physicalNewspaperSubscription.getAddress() + " with a subscription rate of $" +
                physicalNewspaperSubscription.getRate());

        onlineNewspaperSubscription.setName("Jane");
        onlineNewspaperSubscription.setAddress("jane"); // should display error message
        System.out.println(onlineNewspaperSubscription.getRate()); // should be 0.0
        onlineNewspaperSubscription.setAddress("@jane");
        System.out.println(onlineNewspaperSubscription.getName() + " has a subscription established to " +
                onlineNewspaperSubscription.getAddress() + " with a subscription rate of $" +
                onlineNewspaperSubscription.getRate());
    }
}
