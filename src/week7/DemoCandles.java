package week7;

public class DemoCandles {
    public static void main(String[] args) {
        Candle candle1 = new Candle();
        candle1.setColour("Blue");
        candle1.setHeightInches(4);
        System.out.println("The first candle is " + candle1.getColour() + ", standing at " + candle1.getHeightInches()
                + " inches tall with a price of $" + candle1.getPrice());
        ScentedCandle candle2 = new ScentedCandle();
        candle2.setColour("Pink");
        candle2.setHeightInches(4);
        System.out.println("The second candle is " + candle2.getColour() + ", standing at " + candle2.getHeightInches()
                + " inches tall with a price of $" + candle2.getPrice());
    }
}
