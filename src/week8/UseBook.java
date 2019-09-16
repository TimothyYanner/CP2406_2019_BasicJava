package week8;

public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Fiction book");
        NonFiction nonFictionBook = new NonFiction("Non-fiction book");
        System.out.println("The " + fictionBook.getTitle() + "costs $" + fictionBook.getPrice());
        System.out.println("The " + nonFictionBook.getTitle() + "costs $" + nonFictionBook.getPrice());
    }
}
