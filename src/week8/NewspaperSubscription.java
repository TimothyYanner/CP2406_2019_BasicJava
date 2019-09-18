package week8;

public abstract class NewspaperSubscription {
    protected String name;
    protected double rate;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public String getAddress() {
        return address;
    }

    abstract void setAddress(String address);
}
