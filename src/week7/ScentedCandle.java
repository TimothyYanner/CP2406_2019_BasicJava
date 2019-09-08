package week7;

public class ScentedCandle extends Candle{
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
        price = (double)heightInches * 3.0;
    }
}
