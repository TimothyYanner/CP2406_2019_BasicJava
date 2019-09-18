package week8;

public class NonMetalElement extends Element {
    NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    void describeElement() {
        System.out.println(symbol + " is a non-metal element, and thus is a bad conductor. It has an atomic number of "
                + atomicNumber + " and an atomic weight of " + atomicWeight);
    }
}
