package week4;

public class Billing {

    public double computeBill(double photoBookPrice) {
        double pricePlusTax;
        pricePlusTax = photoBookPrice * 1.08;
        return pricePlusTax;
    }

    public double computeBill(double photoBookPrice, int numberPhotoBooks) {
        double pricePlusTax;
        pricePlusTax = photoBookPrice * numberPhotoBooks * 1.08;
        return pricePlusTax;
    }

    public double computeBill(double photoBookPrice, int numberPhotoBooks, double couponValue) {
        double pricePlusTax;
        pricePlusTax = ((photoBookPrice * numberPhotoBooks) - couponValue) * 1.08;
        return pricePlusTax;
    }
}
