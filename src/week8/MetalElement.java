package week8;

public class MetalElement extends Element {
    MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    void describeElement() {
        System.out.println(symbol + " is a metal element, and thus is a good conductor. It has an atomic number of "
        + atomicNumber + " and an atomic weight of " + atomicWeight);
    }
}
