package week4;

public class Sandwich {
    String mainIngredient;
    String breadType;
    double price;

    public String getMainIngredient() {
        mainIngredient = "tuna";
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getBreadType() {
        breadType = "wheat";
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        price = 5.99;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
