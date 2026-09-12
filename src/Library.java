public class Library {
    Book[] books;

    void printAllBooks() {
        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }
    }
}