public class PrintedBook extends Book{
    int pageCount;

    @Override
    void printInfo() {
        System.out.println("[Printed] " + title + " by " + author + " (" + year + ")");
    }git add .

}
    