package week8;

public class ElementArray {
    public static void main(String[] args) {
        MetalElement metalElement1 = new MetalElement("Cu", 29, 63.546);
        NonMetalElement nonMetalElement1 = new NonMetalElement("O", 8, 16.0);
        MetalElement metalElement2 = new MetalElement("Li", 3, 6.939);
        NonMetalElement nonMetalElement2 = new NonMetalElement("Ne", 10, 20.183);
        Element[] elements = {metalElement1, nonMetalElement1, metalElement2, nonMetalElement2};
        int i;
        for (i = 0; i < elements.length; ++i) {
            elements[i].describeElement();
        }
    }
}
