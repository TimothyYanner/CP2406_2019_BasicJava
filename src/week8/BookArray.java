package week8;

public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        int i;
        for (i = 0; i < bookArray.length; ++i) { // generate fiction and non fiction books
            Book newBook;
            if (i % 2 == 0) {
                newBook = new Fiction("fiction book");
            } else {
                newBook = new NonFiction("non-fiction book");
            }
            bookArray[i] = newBook;
        }
        for (i = 0; i < bookArray.length; ++i) {
            System.out.println("The book " + bookArray[i].title + " costs $" + bookArray[i].price); // print details about all books
        }
    }
}
