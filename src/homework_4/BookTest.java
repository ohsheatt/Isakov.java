package homework4;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, 25.99);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());
        System.out.println("Price: " + book.getPrice());

        book.setPrice(19.99);
        System.out.println("New price: " + book.getPrice());
    }
}
