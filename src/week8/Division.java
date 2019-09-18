package week8;

public abstract class Division {
    protected String name;
    protected int accountNumber;

    abstract void display();

    Division(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
}
