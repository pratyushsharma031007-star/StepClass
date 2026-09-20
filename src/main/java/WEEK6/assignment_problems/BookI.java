class Book {
    String title;
    String author;
    int copiesAvailable;

    // Constructor
    Book(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Method to print book details
    void printEntry() {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }
}

public class BookI {
    public static void main(String[] args) {

        // Create 4 Book objects
        Book[] books = {
            new Book("Clean Code", "Robert C. Martin", 3),
            new Book("Effective Java", "Joshua Bloch", 5),
            new Book("Refactoring", "Martin Fowler", 0),
            new Book("Design Patterns", "GoF", 2)
        };

        // Print each book
        for (Book book : books) {
            book.printEntry();
        }
    }
}