public class EBook extends Book {
    double fileSize;

    @Override
    void printInfo() {
        System.out.println("[EBook] " + title + " by " + author + " (" + year + ")");
    }

}
