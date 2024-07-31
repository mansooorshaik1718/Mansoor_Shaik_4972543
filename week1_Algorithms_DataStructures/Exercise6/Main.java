package Exercise6;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(3);

        // Adding books
        lms.addBook(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        lms.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book(3, "1984", "George Orwell"));

        // Linear search for a book
        System.out.println("Linear Search:");
        Book book = lms.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

        // Sort books by title
        lms.sortBooksByTitle();

        // Binary search for a book
        System.out.println("\nBinary Search:");
        book = lms.binarySearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");
    }
}

