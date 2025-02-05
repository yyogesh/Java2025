public class Book {
    String title;

    Book(String t) {
        title = t;
    }

    // Copy Constructor
    Book(Book b) {
        this.title = b.title;
    }

    void show() {
        System.out.println("Book Title: " + title);
    }
}
