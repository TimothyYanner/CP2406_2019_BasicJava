package week8;

public class NonFiction extends Book {
    @Override
    void setPrice(double price) {
        this.price = price;
    }

    NonFiction(String title) {
        super(title);
        this.setPrice(37.99);
    }
}
