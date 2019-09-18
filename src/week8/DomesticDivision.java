package week8;

public class DomesticDivision extends Division {
    private String state;

    DomesticDivision(String name, int accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }

    void display() {
        System.out.println("The domestic division of " + name + " with an account number " + accountNumber +
                " is situated in " + state);
    }
}
