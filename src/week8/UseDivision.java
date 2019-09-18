package week8;

public class UseDivision {
    public static void main(String[] args) {
        // Company 1
        DomesticDivision domesticCompany1 = new DomesticDivision("Company 1", 1, "Queensland");
        InternationalDivision internationalCompany1 = new InternationalDivision("Company 1", 1, "USA", "English");

        // Company 2
        DomesticDivision domesticCompany2 = new DomesticDivision("Company 2", 2, "Victoria");
        InternationalDivision internationalCompany2 = new InternationalDivision("Company 2", 2, "Mexico", "Spanish");

        domesticCompany1.display();
        internationalCompany1.display();
        domesticCompany2.display();
        internationalCompany2.display();
    }
}
