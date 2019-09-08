package week7;

public class Candle {
    protected String colour;
    protected int heightInches;
    protected double price;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
        price = (double)heightInches * 2.0;
    }

    public double getPrice() {
        return price;
    }
}
