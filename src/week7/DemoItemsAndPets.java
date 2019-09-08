package week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold();
        item1.setInvoiceNumber(3);
        item1.setDescription("chew toy");
        item1.setPrice(5.00);

        ItemSold item2 = new ItemSold();
        item2.setInvoiceNumber(4);
        item2.setDescription("tennis ball");
        item2.setPrice(3.00);

        PetSold pet1 = new PetSold();
        pet1.setInvoiceNumber(1);
        pet1.setDescription("blue healer");
        pet1.setPrice(50.00);
        pet1.setVaccinated(true);
        pet1.setNeutered(false);
        pet1.setHousebroken(false);

        PetSold pet2 = new PetSold();
        pet2.setInvoiceNumber(2);
        pet2.setDescription("Labrador");
        pet2.setPrice(70.00);
        pet2.setVaccinated(false);
        pet2.setNeutered(true);
        pet2.setHousebroken(true);

        System.out.println("The first item is a " + item1.getDescription());
        System.out.println("It has an invoice number of " + item1.getInvoiceNumber());
        System.out.println("It costs $" + item1.getPrice());

        System.out.println("The second item is a " + item2.getDescription());
        System.out.println("It has an invoice number of " + item2.getInvoiceNumber());
        System.out.println("It costs $" + item2.getPrice());

        System.out.println("The first pet is a " + pet1.getDescription());
        System.out.println("It has an invoice number of " + pet1.getInvoiceNumber());
        System.out.println("It costs $" + pet1.getPrice());
        System.out.println("Its vaccination status is " + pet1.isVaccinated());
        System.out.println("Its neutered status is " + pet1.isNeutered());
        System.out.println("Its housebroken status is " + pet1.isHousebroken());

        System.out.println("The second pet is a " + pet2.getDescription());
        System.out.println("It has an invoice number of " + pet2.getInvoiceNumber());
        System.out.println("It costs $" + pet2.getPrice());
        System.out.println("Its vaccination status is " + pet2.isVaccinated());
        System.out.println("Its neutered status is " + pet2.isNeutered());
        System.out.println("Its housebroken status is " + pet2.isHousebroken());
    }
}
