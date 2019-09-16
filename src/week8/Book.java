package week8;

public abstract class Book {
    String title;
    double price;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    abstract void setPrice(double price);
}
