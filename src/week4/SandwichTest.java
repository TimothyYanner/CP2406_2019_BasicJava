package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SandwichTest {
    @Test void checkGetMainIngredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient("tuna");
        assertEquals("tuna", sandwich.getMainIngredient());
    }
    @Test void checkSetMainIngredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient("tuna");
        assertEquals("tuna", sandwich.mainIngredient);
    }
    @Test void checkGetBreadType() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBreadType("wheat");
        assertEquals("wheat", sandwich.getBreadType());
    }
    @Test void checkSetBreadType() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBreadType("wheat");
        assertEquals("wheat", sandwich.breadType);
    }
    @Test void checkGetPrice() {
        Sandwich sandwich = new Sandwich();
        sandwich.setPrice(5.99);
        assertEquals(5.99, sandwich.getPrice());
    }
    @Test void checkSetPrice() {
        Sandwich sandwich = new Sandwich();
        sandwich.setPrice(5.99);
        assertEquals(5.99, sandwich.price);
    }
}