package week8;

public class InternationalDivision extends Division{
    private String country;
    private String languageSpoken;

    InternationalDivision(String name, int accountNumber, String country, String languageSpoken) {
        super(name, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    void display() {
        System.out.println("The international division of " + name + " with an account number " + accountNumber +
                " is situated in " + country + " where " + languageSpoken + " is spoken");
    }
}
