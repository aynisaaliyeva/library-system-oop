//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "1984";
        book1.author = "Goerge Orwell";
        book1.year = 1949;
        System.out.println(book1.title + " " + book1.author + " " + book1.year);

        Book book2 = new Book();
        book2.title = "Atomic Habits";
        book2.author = "James Clear";
        book2.year = 2018;
        System.out.println(book2.title + " " + book2.author + " " + book2.year);

        book1.printInfo();
        book2.printInfo();

        EBook ebook1 = new EBook();
        ebook1.title = "Grammar in use";
        ebook1.author = "Raymond Murphy";
        ebook1.year = 2019;
        ebook1.fileSize = 2.5;
        System.out.println(ebook1.title + " " + ebook1.author + " " + ebook1.year + " " + ebook1.fileSize);

        Book myBook = ebook1;
        System.out.println(myBook.title);

        ebook1.printInfo();
        myBook.printInfo();

        Library library = new Library();
        library.books = new Book[2];
        library.books[0] = ebook1;
        library.books[1] = myBook;

        library.printAllBooks();

        Book b1 = new Book();
        b1.title = "1984";
        b1.author = "George Orwell";
        b1.year = 1949;

        Book b2 = new Book();
        b2.title = "1984";
        b2.author = "George Orwell";
        b2.year = 1949;

        System.out.println(b1.equals(b2));


    }
}