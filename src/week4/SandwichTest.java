package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SandwichTest {
    @Test void checkGetMainIngredient() {
        Sandwich sandwich = new Sandwich();
        String mainIngredient = sandwich.getMainIngredient();
        assertEquals("tuna", mainIngredient);
    }
    @Test void checkSetMainIngredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient("tuna");
        assertEquals("tuna", sandwich.mainIngredient);
    }
    @Test void checkGetBreadType() {
        Sandwich sandwich = new Sandwich();
        String breadType = sandwich.getBreadType();
        assertEquals("wheat", breadType);
    }
    @Test void checkSetBreadType() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBreadType("wheat");
        assertEquals("wheat", sandwich.breadType);
    }
    @Test void checkGetPrice() {
        Sandwich sandwich = new Sandwich();
        double price = sandwich.getPrice();
        assertEquals(5.99, price);
    }
    @Test void checkSetPrice() {
        Sandwich sandwich = new Sandwich();
        sandwich.setPrice(5.99);
        assertEquals(5.99, sandwich.price);
    }
}