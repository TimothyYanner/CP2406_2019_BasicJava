package week8;

public class Fiction extends Book{
    @Override
    void setPrice(double price) {
        this.price = price;
    }

    Fiction(String title) {
        super(title);
        this.setPrice(24.99);
    }
}
